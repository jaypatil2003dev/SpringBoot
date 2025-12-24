package com.project.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile(value = "dev")
public class Sb05ActuatorsProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb05ActuatorsProfilesApplication.class, args);
	}

}
