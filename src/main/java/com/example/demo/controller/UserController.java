package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserServiceImp;

@RestController()
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserServiceImp userService;
	
	@PostMapping("")
	public @ResponseBody User save(@RequestBody User user)
	{
		return userService.save(user);
	}
}

