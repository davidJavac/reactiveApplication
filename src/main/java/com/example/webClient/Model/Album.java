package com.example.webClient.Model;

import java.io.Serializable;

public class Album implements Serializable{

	private Long userId;
	private Long id;
	private String title;
	
	public Album(Long userId, Long id, String title) {
		
		this.userId = userId;
		this.id = id;
		this.title = title;
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
		return "Album [userId=" + userId + ", id=" + id + ", title=" + title + "]";
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
