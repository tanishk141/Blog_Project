package com.gossip.dto.request;

public class UpdateCommentRequest {

	private Integer commentId;

	private String title;

	private Integer userId;

	private Integer blogId;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	@Override
	public String toString() {
		return "UpdateCommentRequest [commentId=" + commentId + ", title=" + title + ", userId=" + userId + ", blogId="
				+ blogId + "]";
	}

}
