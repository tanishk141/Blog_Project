package com.gossip.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Blog")
public class Blog {
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    @Id
	private Integer id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "publish")
	private Boolean publish;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getPublish() {
		return publish;
	}

	public void setPublish(Boolean publish) {
		this.publish = publish;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "Blog [title=" + title + ", description=" + description + ", publish=" + publish + ", user=" + user
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
}
