package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Customer;
import java.util.Optional;


public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	Optional<Customer> findByEmail(String email);

}