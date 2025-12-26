package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.model.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
