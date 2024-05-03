package com.gossip.dto.response;



public class BlogResponse {

	private String status;
	
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BlogResponse [status=" + status + ", message=" + message + "]";
	}
	
	public BlogResponse()
	{
		
	}
	
	public BlogResponse(String status,String message) {
		
		this.status=status;
		this.message=message;
		
	}
	
	
}
