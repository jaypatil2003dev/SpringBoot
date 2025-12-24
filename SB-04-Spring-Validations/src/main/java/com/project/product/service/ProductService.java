package com.project.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.product.dao.ProductDAO;
import com.project.product.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public Product save(Product product) {
		return productDAO.save(product);
	}

}
