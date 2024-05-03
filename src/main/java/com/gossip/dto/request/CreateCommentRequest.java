package com.gossip.dto.request;

public class CreateCommentRequest {

    private String title;

    private String userName;

    private Integer blogId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	@Override
	public String toString() {
		return "CreateCommentRequest [title=" + title + ", userName=" + userName + ", blogId=" + blogId + "]";
	}

	


}
