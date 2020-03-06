package com.example.webClient.Model;

import java.io.Serializable;

public class Post implements Serializable{

	private Long userId;
	private Long id;
	private String title;
	private String body;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Long getUserId() {
		return userId;
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", id=" + id + ", title=" + title + "]";
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
