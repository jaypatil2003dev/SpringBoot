package com.project.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.product.model.Product;
import com.project.product.service.ProductService;

@RestController
@RequestMapping("/pd")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
  @PostMapping("/saved")
  public ResponseEntity<Product> saveProduct(@RequestBody Product product){
	  productService.save(product);
	  ResponseEntity<Product> resp = new ResponseEntity<Product>(HttpStatus.CREATED);
	  return resp;
	  
  }
	
	

}
