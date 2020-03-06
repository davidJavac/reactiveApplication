package com.example.webClient.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webClient.Model.Album;
import com.example.webClient.Model.Post;
import com.example.webClient.service.MyService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class WebClientController {

	
	@Autowired
	private MyService myService;
	
	@GetMapping("/album")
	public ResponseEntity<Mono<List<Album>>> getAlbum() {
		
		Mono<Post> post1 = myService.someRestCall("1");
		Mono<Post> post2 = myService.someRestCall("2");
		Mono<Post> post3 = myService.someRestCall("3");
		Mono<Post> post4 = myService.someRestCall("4");
		   //Mono<Album> bar = myService.someRestCall("bar");
		   //Mono<Album> baz = myService.someRestCall("baz");

		   // ..and use the results (thx to: [2] & [3]!):

		   // Subscribes sequentially:

		   // System.out.println("=== Flux.concat(foo, bar, baz) ===");
		   // Flux.concat(foo, bar, baz).subscribe(System.out::print);

		   // System.out.println("\n=== combine the value of foo then bar then baz ===");
		   // foo.concatWith(bar).concatWith(baz).subscribe(System.out::print);

		   // ----------------------------------------------------------------------
		   // Subscribe eagerly (& simultaneously):
		   System.out.println("\n=== Flux.merge(foo, bar, baz) ===");
		   
		return ResponseEntity.status(HttpStatus.OK).
				body(Flux.merge(post1, post2, post3, post4).map(e ->{
					
					return new Album(4L, 5L, "");
				} ).collect(Collectors.toList()));
	}
	
}
