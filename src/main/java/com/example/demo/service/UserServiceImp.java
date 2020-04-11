package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImp {

	@Autowired
	private UserRepository userRepo;
	
	
	public User save(User user)
	{
		return userRepo.save(user);
	}
}
