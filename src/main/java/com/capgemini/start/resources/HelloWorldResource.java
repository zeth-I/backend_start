package com.capgemini.start.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class HelloWorldResource {
	
	@GetMapping
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Olá mundo!");
	}

}
