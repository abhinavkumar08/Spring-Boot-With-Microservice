package com.microservice.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.spring.user.entity.User;
import com.microservice.spring.user.service.UserService;
import com.microservice.spring.user.vo.ResponseInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		
		log.info("Inside the save user of the controller");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseInfo getUserWithDepartment(@PathVariable Long id) {
		log.info("Inside the get user of the controller");
		return userService.getUserWithDepartment(id);
	}
	
	

}
