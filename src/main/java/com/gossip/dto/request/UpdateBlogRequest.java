package com.gossip.dto.request;

public class UpdateBlogRequest {
	
    private Integer blogId;
	
	private String title;
	
	private String description;
	
	private Boolean publish;
	
	private String userId;
	
	

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UpdateBlogRequest [blogId=" + blogId + ", title=" + title + ", description=" + description
				+ ", publish=" + publish + ", userId=" + userId + "]";
	}
	
	

}
