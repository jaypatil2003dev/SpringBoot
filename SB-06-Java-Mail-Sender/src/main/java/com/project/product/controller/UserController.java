package com.project.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.product.service.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/send")
	public String sendEmail(@RequestParam String toEmail) {
		
		String subject="Asach email kela vedi";
		String body="Vedi tar tu ahech";
		emailService.sendEmail(toEmail, body, subject);
		
		return "Email sent";
	}
	
	@GetMapping("/welcome")
	public String sendWithTemplate(@RequestParam String toEmail, @RequestParam String username) throws Exception{
		
		String subject= "Love You";
		emailService.sendEmailWithTemplate(toEmail, subject, username);
		
		
		return "Email Sent with template";
	}
	
	

}
