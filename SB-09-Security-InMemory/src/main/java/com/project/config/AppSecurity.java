package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurity {
	
//	In-memory
	@Bean
	public UserDetailsService getUSerDetailsService() {
		
		UserDetails publicUser= User.builder()
				.username("dinga")
				.password(encoder().encode("dinga@123"))
				.roles("PUBLIC")
				.build();
		
		UserDetails user = User.builder()
				.username("penga")
				.password(encoder().encode("penga@123"))
				.roles("USER")
				.build();
		
		UserDetails admin = User.builder()
				.username("jay")
				.password(encoder().encode("jay@123"))
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(publicUser,user,admin);
				
			
	}
	
	


	//	Security Filter
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		http.csrf(c-> c.disable())
		     .authorizeHttpRequests(req->req
		    		 .requestMatchers("/public/**").permitAll()
		    		 .requestMatchers("/user/**").hasAnyRole("USER","ADMIN")
		    		 .requestMatchers("/admin/**").hasRole("ADMIN")
		    		 .anyRequest().authenticated()
		    		 )
		     .formLogin(Customizer.withDefaults())
		     .logout(Customizer.withDefaults());
		
		return http.build();
		            
	}
	
//	password Encoder
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
				
	}

}
