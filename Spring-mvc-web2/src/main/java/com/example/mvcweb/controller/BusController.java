package com.example.mvcweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvcweb.BusRepo;
import com.example.mvcweb.entity.Bus;

@RestController
public class BusController {

	@Autowired
	BusRepo busRepo;
	
	
	@RequestMapping(value="/busses/" ,method=RequestMethod.GET)
	public List<Bus> findallBus(){
		return busRepo.findAll();
		
	}
	
	
	@RequestMapping(value="/bus/{id}" ,method=RequestMethod.GET)
	public Bus findbyIdBus(@PathVariable(value="id") int id){
		return busRepo.findById(id).get();
	}
	
	
	@RequestMapping(value="/bus" , method=RequestMethod.POST)
	public Bus createBus(@RequestBody Bus bus){
		return busRepo.save(bus);
		
	}
	
}
