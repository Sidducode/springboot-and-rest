package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	Map<Integer,Product> products=new HashMap<>();
	
	int currentId=123;
	
	
	public ProductServiceImpl(){
		
		init();
	}
	
	void init(){
		
		Product product=new Product();
		product.setId(currentId);
		product.setName("sid");
		products.put(product.getId(), product);
		
	}
	
	
	
	
	
	@Override
	public List<Product> productList() {

    Collection<Product> result=products.values();
    List<Product> response= new ArrayList<>(result);
    
		return response;
	}

	@Override
	public Product getProduct(int id) {
		
		return products.get(id);
	}

}
