package com.yakub.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.yakub.profile.model.User;
import com.yakub.profile.repo.UserRepo;
@Service
@Profile(value={"local","dev","prod","qa"})
public class UserService {

	
	@Autowired
	private UserRepo repo;
	public List<User> getAll()
	{
		return repo.findAll();
	}
}
