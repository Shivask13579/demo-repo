package com.example.crup.service;

import java.util.List;

import com.example.crup.models.User;

public interface UserService {
	User addUser(User user);
	
	List<User> allUsers();
}
