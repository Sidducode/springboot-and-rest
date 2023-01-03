package com.example.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.example.demo.model.Product;

@Path("/productservice")
public interface ProductService {

	@Path("/products")
	@GET
	List<Product> productList();
	
	@Path("/product/{id}")
	@GET
	public Product getProduct(@PathParam(value = "id") int id);
	
	
}
