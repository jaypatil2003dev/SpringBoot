package com.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/public")
public class PublicController {
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Public says hiii!!!!!!";
	}
	

}
