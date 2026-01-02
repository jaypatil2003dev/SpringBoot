package com.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.dto.LoginDTO;
import com.project.dto.RegisterDTO;
import com.project.model.Customer;
import com.project.repository.CustomerRepo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody RegisterDTO register) {
		Optional<Customer> opt = customerRepo.findByEmail(register.getEmail());

		if (opt.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Already Registered");
		}

		Customer customer = new Customer();
		customer.setName(register.getName());
		customer.setEmail(register.getEmail());
		customer.setPassword(passwordEncoder.encode(register.getPassword()));

		customerRepo.save(customer);

		return ResponseEntity.status(HttpStatus.CREATED).body("Registered Successfully");
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
		try {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginDTO.getEmail(),
					loginDTO.getPassword());

			Authentication authenticate = authenticationManager.authenticate(token);

			if (authenticate.isAuthenticated())
				return ResponseEntity.status(HttpStatus.OK).body("Logged In Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid credentials");
	}

	@GetMapping("/greet")
	public String greetAPI() {
		return "Hey good morning";
	}

}
