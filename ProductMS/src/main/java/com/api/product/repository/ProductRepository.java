package com.api.product.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.api.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategory(String category);
	Product findByProductName(String productName);
	Product findByProdid(Integer prodid);
	
}
