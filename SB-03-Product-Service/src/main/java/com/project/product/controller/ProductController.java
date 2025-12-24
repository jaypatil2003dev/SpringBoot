package com.project.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Product;

@RestController
@RequestMapping("/pd")
public class ProductController {
	
	@GetMapping("/data")
	public String getData(@RequestParam(name="id")Integer pid, @RequestParam String name) {
		System.out.println("ProductId :"+pid);
		System.out.println("Name: "+name);
		System.out.println("triggered");
		return "Name :"+name+", Id :"+pid;
	}

	@GetMapping("/path/{id}/{price}")
	public String pathData(@PathVariable(name="id")Integer prodId,@PathVariable double price) {
		System.out.println("Product Id :"+prodId);
		System.out.println(price);
		
		return "Product id: "+prodId;
	}
	@GetMapping("/head")
	public String headData(@RequestHeader String token) {
		System.out.println("token: "+token);
		
		return "Header Data";
	}
	
	@GetMapping("/body")
	public Product bodyData(@RequestBody Product product) {
		System.out.println(product);
		return product;
	}
	
	
	
}
