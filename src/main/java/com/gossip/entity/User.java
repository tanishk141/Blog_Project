package com.gossip.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    @Id
	private Integer id;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private Byte role;
	
	@Column(name="createdAt")
	private LocalDateTime createdAt;
	
	@Column(name="updatedAt")
	private LocalDateTime updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", password=" + password
				+ ", role=" + role + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
}
