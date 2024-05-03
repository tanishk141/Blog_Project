package com.gossip.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegisterUserRequest {
	
	@NotBlank
	private String fullName;
	
	@NotBlank
	private String userName;
	
	@NotBlank
	private String password;
	
	@NotNull
	private Byte role;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getRole() {
		return role;
	}

	public void setRole(Byte role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "RegisterUserRequest [fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	
	
}
