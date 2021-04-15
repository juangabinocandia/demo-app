package org.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello wolrd";
	}
}
