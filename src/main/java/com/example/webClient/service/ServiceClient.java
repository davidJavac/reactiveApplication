package com.example.webClient.service;

import com.example.webClient.Model.Album;
import com.example.webClient.Model.Post;

public class ServiceClient {

	public Album getAlbum(IModel modelAdapter) {
		
		return new Album(modelAdapter.getId(), 5L, modelAdapter.getBody());
	}
}
