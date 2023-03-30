package com.example.crup.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crup.models.User;
import com.example.crup.repository.UserRepository;
import com.example.crup.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
	   return userRepository.save(user);
	}
	
	@Override
	public List<User> allUsers(){
		return userRepository.findAll();
	}
	
}
