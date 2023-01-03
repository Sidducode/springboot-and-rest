package com.example.demo;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.example.demo.entityes.Product;

@WebService 
@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/product")
public interface ProductService {
	
	@Path("/producs")
	@GET
	List<Product> getProducts();
	
	@Path("/produc/{id}")
	@GET
	Product getproduct(@PathParam(value = "id")int id);
	
	@Path("/createproduc")
	@POST
	Response createProduct(Product product);
	
	@Path("/updateproduc")
	@PUT
	Response updateProduct(Product product);
	
	@Path("/deleteproduc/{id}")
	@DELETE
	void deleteProduct(@PathParam(value = "id") int id);
	
	
	@Path("/deleteproduc1/{id}")
	@DELETE
	Response deleProduct(@PathParam(value = "id") int id);

}
