package com.example.demo.rest.services;

import java.util.List;

import com.example.demo.entities.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product getProduct(long productId);

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public void deleteProduct(long parseLong);

	public void activateProduct(Long productId);

	public void deactivateProduct(Long productId);

	public List<Product> getAllProducts();

}
