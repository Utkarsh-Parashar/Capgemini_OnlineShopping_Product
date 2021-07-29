package com.capg.sprint1.product.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.capg.sprint1.product.entities.Product;

public interface IProductService {

	//public Product addProduct(Product product);
	public ResponseEntity<Product> addProduct(Product product);
	
	public ResponseEntity<List<Product>> viewAllProducts();
	public ResponseEntity<Product> viewProductById(String id);
	public ResponseEntity<List<Product>> viewProductsByCategory(String cat); 
	public ResponseEntity<Product> updateProduct(String productId,Product product);
	public ResponseEntity<HttpStatus> removeProduct(String prodid);
}
