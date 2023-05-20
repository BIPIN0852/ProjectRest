package com.example.demo.rest.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private final ProductRepository productRepository;

	// List<Product> list;

	public ProductServiceImpl() {

		this.productRepository = null;

	}

	@Override
	public List<Product> getProducts() {

		return productRepository.findAll();
	}

	@Override
	public Product getProduct(long productId) {

		return productRepository.getOne(productId);
	}

	@Override
	public Product addProduct(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {

		productRepository.save(product);

		return product;
	}

	@Override
	public void deleteProduct(long parseLong) {
		Product entity = productRepository.getOne(parseLong);
		productRepository.delete(entity);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void activateProduct(Long productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		optionalProduct.ifPresent(product -> {
			product.setActive(true);
			productRepository.save(product);
		});
	}

	@Override
	public void deactivateProduct(Long productId) {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		optionalProduct.ifPresent(product -> {
			product.setActive(false);
			productRepository.save(product);
		});
	}
}
