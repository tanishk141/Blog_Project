package com.gossip.serviceInterf;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.gossip.dto.request.LoginUserRequest;
import com.gossip.dto.request.RegisterUserRequest;
import com.gossip.dto.response.GREResponseEntity;
import com.gossip.entity.User;

public interface UserServiceInterface {
    
	ResponseEntity<GREResponseEntity<User>> registerUser(RegisterUserRequest registerUserRequest);
	ResponseEntity<GREResponseEntity<String>> login(LoginUserRequest loginUserRequest) throws Exception;
    List<User> getAllUsers();
    Optional<User> getUserById(Integer userId);
}


