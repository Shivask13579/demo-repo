package com.example.crup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crup.models.User;
import com.example.crup.service.UserService;

@RestController
@RequestMapping("/bot")
public class UserController {

	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/addBot")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@GetMapping("/allUsers")
	public List<User> getAllUsers(){
		return userservice.allUsers();
	}
}
