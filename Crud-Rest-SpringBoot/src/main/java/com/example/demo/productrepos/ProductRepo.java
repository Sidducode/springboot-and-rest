package com.example.demo.productrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entityes.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
