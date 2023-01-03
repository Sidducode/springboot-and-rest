package com.example.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.demo.model.Passangers;

@Path("/passengerservice")
@Consumes("application/xml")
@Produces("application/xml")
public interface PassangersService {
	
	@Path("/passengers")
	@GET()
	List<Passangers> getPassanger();
	
	@Path("/passengers")
	@POST
	Passangers addPassangers(Passangers passanger);

}
