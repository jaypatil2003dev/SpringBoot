package com.project.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@PostMapping("/save")
	public String saveStudent() {
		System.out.println("Student saved");
		return "saved successfully";
	}
	
	@GetMapping("/get")
	public String getStudent() {
		System.out.println("Student deleted successfully");
	return "Student fetched successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent() {
		System.out.println("Student fetched");
     	return "Fetched successfully";
	}
	
	@PutMapping("/update")
	public String updateStudent() {
		System.out.println("Student updated successfully");
		return "student updated";
	}
	
	

}
