package com.example.webClient.service;

import com.example.webClient.Model.Song;

public class SongAdapter implements IModel{

	private Song song;
	
	public SongAdapter(Song song) {
		
		this.song = song;
	}
	
	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return song.getNumber() + " " + song.getName();
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return Long.parseLong(song.getNumber());
	}

}
