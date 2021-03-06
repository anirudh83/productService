package com.anirudhbhatnagar.productService.repository;

import com.anirudhbhatnagar.productService.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
