package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepos;

@RestController
public class ProductController {
	@Autowired
	ProductRepos productRepos;
	
	
	
	//private Optional<Product> findById;
	
	@RequestMapping(value = "/products/" ,method = RequestMethod.GET)
	public List<Product>  getProducts(){
		return productRepos.findAll();
		
	}

	@RequestMapping(value = "/getproduct/{id}" ,method = RequestMethod.GET)
	public Product  getProduct(@PathVariable("id")int id){
		return productRepos.findById(id).get();
		
	}
		
	@RequestMapping(value = "/createproduct/" ,method = RequestMethod.POST)
	public Product  createProduct(@RequestBody  Product product){
		return productRepos.save(product);
		
	}  
	
	@RequestMapping(value = "/updateproduct/" ,method = RequestMethod.PUT)
	public Product  updateProduct(@RequestBody  Product product){
		return productRepos.save(product);
		
	}
		
	@RequestMapping(value = "/deleteproduct/{id}" ,method = RequestMethod.DELETE)
	public void  deleteProduct(@PathVariable("id")int id){
		productRepos.deleteById(id);
		
	}
	
}
