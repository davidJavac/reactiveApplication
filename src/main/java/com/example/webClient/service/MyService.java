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
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com/posts/").build();
    }

    public Mono<Post> someRestCall(String name) {
    	
        return this.webClient.get().uri("/{name}", name)
                        .retrieve().bodyToMono(Post.class);
    }
    
    public Album mapPost(Post post) {
    	
    	return new Album(4l, 5l, "hardcodeado");
    }
}
