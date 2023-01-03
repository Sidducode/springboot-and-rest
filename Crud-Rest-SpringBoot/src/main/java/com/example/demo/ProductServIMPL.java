package com.example.demo;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entityes.Product;
import com.example.demo.productrepos.ProductRepo;

@Service
public class ProductServIMPL implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Product> getProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getproduct(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product saveProduct=productRepo.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product updateProduct=productRepo.save(product);
		return Response.ok(updateProduct).build();
	}

	
	@Override
	public void deleteProduct(int id) {

		productRepo.deleteById(id);
		
		
	}

	@Override
	public Response deleProduct(int id) {
		
		
		Product p1=productRepo.findById(id).get();
		
		//Product p=productRepo.getById(id);
		
		Response res;
		
		if(p1!=null) {
			productRepo.deleteById(id);
			res = Response.ok().build();
	       }else {
	    	   res = Response.notModified().build();
	       }
		return res;
	}

	

	

	

}
