package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/demo")
public class HelloController {
	public static final List<Student> list = new ArrayList<>();
	static {
		for (int i = 1; i < 11; i++) {
			Student stu = new Student();
			stu.setAge(12 + i);
			stu.setId(i);
			stu.setName("x" + i);
			list.add(stu);
		}
	}

	@RequestMapping("/index")
	public String hello() {

		return "hey man!";
	}

	@RequestMapping("/student/{id}")
	public Student getStuById(@PathVariable("id") Integer id) {
		if (id < 11)
			return list.get(id-1);
		return null;
	}

	@RequestMapping("/students")
	public List<Student> getStus() {
		return list;
	}

}
