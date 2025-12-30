package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TestController {
	
	@GetMapping("/register")
	public String reg() {
		return "Registered";
	}
	
	@PostMapping("/greet")
	public String greet() {
		return "Hi good morning";
	}
	
	@GetMapping("/msg")
	public String msg() {
		return "This is msg API";
	}
	

}
