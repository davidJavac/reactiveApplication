package com.example.webClient.service;

import com.example.webClient.Model.Post;

public class PostAdapter implements IModel{

	private Post post;
	
	public PostAdapter(Post post) {
		
		this.post = post;
	}
	
	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return post.getBody();
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return post.getId();
	}


}
