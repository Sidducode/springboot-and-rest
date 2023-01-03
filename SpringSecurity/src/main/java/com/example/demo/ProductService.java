package com.example.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.demo.model.Product;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/productservice")
public interface ProductService {

	@Path("/products")
	@GET
	List<Product> getProducts();

	
	@Path("/product")
	@POST
	long addProduct(Product product);
}
