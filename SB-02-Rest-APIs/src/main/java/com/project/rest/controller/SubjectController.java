package com.project.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub")
public class SubjectController {
	
	@PostMapping("/save")
	public String saveSubject() {
		System.out.println();
		return "Subject saved";
	}
	
	@GetMapping("/get")
	public String getStudent() {
		System.out.println("Subject fetched");
		return "Subject fetched";
	}

}
