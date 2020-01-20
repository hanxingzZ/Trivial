package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.service.HelloService;
import com.example.demo.service.impl.HelloServiceImpl;
import com.github.pagehelper.PageHelper;

@RestController
public class HelloController {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloService.class);
	HelloService helloService = context.getBean(HelloService.class);

	@GetMapping("/hello")
	public String hello() {

		return "hey man!";
	}

	@GetMapping("/demo")
	public Student getStu() {
		Student stu = new Student();
		stu.setAge(12);
		stu.setId(1);
		stu.setName("小x");

		return stu;
	}

	@GetMapping("/demos")
	public List<Student> getStus() {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student stu = new Student();
			stu.setAge(12 + i);
			stu.setId(i + 1);
			stu.setName("x" + i);
			list.add(stu);
		}

		return list;
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/users")
	public List<User> getUserList() {

		List<User> list = new ArrayList<>();
		PageHelper.startPage(1, 5);
		list = helloService.getUserList();
		System.err.println(list.toString());
		return list;
	}

	@GetMapping("/user")
	public JSONObject insert(User record) {

		JSONObject obj = new JSONObject();
		System.err.println("contr1" + record);
		helloService.insert(record);
		System.err.println("contr2" + record);
		obj.put("result", true);
		obj.put("data", record);
		return obj;
	}

	/**
	 * 
	 * Description:map转object方法
	 * 
	 * @author 韩兴（13039997950@163.com）
	 * @date 2018年9月28日 上午10:22:00
	 * @param map
	 * @param beanClass
	 * @return
	 * @throws Exception
	 */
	public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
		if (map == null)
			return null;

		Object obj = beanClass.newInstance();

		org.apache.commons.beanutils.BeanUtils.populate(obj, map);

		return obj;
	}

}
