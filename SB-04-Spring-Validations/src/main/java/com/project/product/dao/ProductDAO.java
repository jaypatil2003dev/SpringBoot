package com.project.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.product.model.Product;
import com.project.product.repository.ProductRepository;

@Repository
public class ProductDAO {
	
	@Autowired
	 private ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}

}
