package com.masai.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.main.entity.UserEntity;
import com.masai.main.request.UserRegistrationRequest;
import com.masai.main.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserRegistrationRequest request){
		
		UserEntity user = userService.createUser(request);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	

}
