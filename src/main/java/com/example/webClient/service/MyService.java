package com.example.webClient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.webClient.Model.Album;
import com.example.webClient.Model.Post;

import reactor.core.publisher.Mono;

@Service
public class MyService {

	private final WebClient webClient;

    public MyService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:9999/post").build();
    }

    public Mono<?> someRestCall(String name, Class<?> classType) {
    	
        return this.webClient.get().uri("/{name}", name)
                        .retrieve().bodyToMono(classType);
    }
    
    public Album mapPost(Post post) {
    	
    	return new Album(4l, 5l, "hardcodeado");
    }
}
