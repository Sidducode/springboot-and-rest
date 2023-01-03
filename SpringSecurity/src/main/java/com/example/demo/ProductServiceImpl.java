package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products = new ArrayList<>();
	private long currentId=123;
	
	ProductServiceImpl(){
		
		Product product= new Product();
		product.setId(++currentId);
		product.setDescription("siddilasha Sidd");
		products.add(product);
	}
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addProduct(Product product) {
		product.setId(++currentId);
		products.add(product);
		System.out.println("sidd");
		return product.getId();
	}

}
