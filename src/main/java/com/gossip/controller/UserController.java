package com.gossip.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gossip.dto.request.LoginUserRequest;
import com.gossip.dto.request.RegisterUserRequest;
import com.gossip.dto.response.GREResponseEntity;
import com.gossip.entity.User;
import com.gossip.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	  
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping(path="registerUser")
	public ResponseEntity<GREResponseEntity<User>> registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
		return userServiceImpl.registerUser(registerUserRequest); 
	}	

	@PutMapping(path="userLogin") 
	ResponseEntity<GREResponseEntity<String>> userLogin(@RequestBody LoginUserRequest loginUserRequest){
		return userServiceImpl.login(loginUserRequest);
	}
	
	@GetMapping(path="searchUserById")
	public Optional<User> searchUserById(@RequestParam Integer userId){
		
		return userServiceImpl.getUserById(userId);
	}
	
	}


