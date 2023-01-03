package com.example.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.entity.Product;

public interface ProductRepos extends JpaRepository<Product, Integer> {

}
