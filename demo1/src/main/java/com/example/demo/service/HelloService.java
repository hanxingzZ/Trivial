package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface HelloService {

	List<User> getUserList();

	void insert(User record);
}
