package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.HelloMapper;
import com.example.demo.model.User;
import com.example.demo.service.HelloService;

@Service("HelloService")
public class HelloServiceImpl implements HelloService {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private HelloMapper helloMapper;

	@Override
	public List<User> getUserList() {
		return helloMapper.getAllUser();
	}

	@Override
	public void insert(User record) {
		System.err.println("service1" + record);
		helloMapper.insert(record);
		System.err.println("service1" + record);
	}

}
