package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.ProductRepos;
import com.example.product.entity.Product;

@RestController
public class ProductController {

	@Autowired
	ProductRepos productRepos;
	
	@RequestMapping(value = "/getproducts",method = RequestMethod.GET)
	public List<Product> getAll(){
		return productRepos.findAll();
	}
	
	@RequestMapping(value = "/getproduct/{id}",method = RequestMethod.GET)
	public Product getsingle(@PathVariable(value="id")  int id){
		return productRepos.findById(id).get();
		
	}
	
	@RequestMapping(value = "/product",method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product){
		return productRepos.save(product);
		
	}
	
}
