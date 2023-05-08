package com.yakub.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yakub.profile.model.User;
import com.yakub.profile.service.UserService;

import java.util.*;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/getAll")
	public List<User> getUser()
	{
		return service.getAll();
	}
}
