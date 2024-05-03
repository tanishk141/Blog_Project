package com.gossip.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gossip.dto.request.LoginUserRequest;
import com.gossip.dto.request.RegisterUserRequest;
import com.gossip.dto.response.GREResponseEntity;
import com.gossip.entity.User;
import com.gossip.repository.UserRepo;
import com.gossip.serviceInterf.UserServiceInterface;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepo userRepo;

	public ResponseEntity<GREResponseEntity<User>> registerUser(RegisterUserRequest registerUserRequest) {

		User usertemp = userRepo.findByUserName(registerUserRequest.getUserName());

		if (!Objects.isNull(usertemp)) {
			GREResponseEntity<User> greResponseEntity = new GREResponseEntity();
			// greResponseEntity.setData(usertemp);
			greResponseEntity.setMessage("UserName is already registered,try to login");
			return new ResponseEntity<>(greResponseEntity, HttpStatus.ALREADY_REPORTED);
		}

		User user = new User();

		user.setFullName(registerUserRequest.getFullName());
		user.setUserName(registerUserRequest.getUserName());
		user.setPassword(registerUserRequest.getPassword());
		user.setRole(registerUserRequest.getRole());
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());

		userRepo.save(user);
		GREResponseEntity<User> greEntity = new GREResponseEntity();
		greEntity.setMessage("User registered successfully");
		return new ResponseEntity<>(greEntity, HttpStatus.CREATED);
	}

	public ResponseEntity<GREResponseEntity<String>> login(LoginUserRequest loginUserRequest) {

		User user = userRepo.findByUserName(loginUserRequest.getUserName());
		try {
			if (Objects.isNull(user)) {
				GREResponseEntity<String> errorResponse = new GREResponseEntity<>();
				errorResponse.setMessage("User not found");
				return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

			}

			if (!user.getPassword().equals(loginUserRequest.getPassword())) {
				GREResponseEntity<String> errorResponse = new GREResponseEntity<>();
				errorResponse.setMessage("Invalid username or password");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
			}

			GREResponseEntity<String> successResponse = new GREResponseEntity<>();
			successResponse.setMessage("Login succesful");
			return new ResponseEntity<>(successResponse, HttpStatus.OK);
		} catch (Exception e) {


			GREResponseEntity<String> errorResponse = new GREResponseEntity<>();
			errorResponse.setMessage("An error occured.please try again later");
			return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	public Optional<User> getUserById(Integer userId) {

		Optional<User> user = userRepo.findById(userId);

		return user;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
