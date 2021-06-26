package com.avanade.dio.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.dio.api.model.UserModel;
import com.avanade.dio.api.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/list-all")
	public Iterable<UserModel> listAll() {
		return userRepository.findAll();
	}
	
	@PostMapping("/save")
	public void save(@RequestBody UserModel user) {
		userRepository.save(user);
	}

}
