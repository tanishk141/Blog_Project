package com.gossip.dto.response;

public class CommentResponse {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CommentResponse [message=" + message + "]";
	}
	
	

}
