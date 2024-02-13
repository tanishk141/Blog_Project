package com.gossip.dto.request;

public class CreateBlogRequest {
	
	
	private String title;
	
	private String description;
	
	private Boolean publish;
	
	
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

	@Override
	public String toString() {
		return "CreateBlogRequest [title=" + title + ", description=" + description + ", publish=" + publish
				+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getPublish()="
				+ getPublish() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	

}
