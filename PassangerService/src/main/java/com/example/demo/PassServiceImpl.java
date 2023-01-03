package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Passangers;

@Service
public class PassServiceImpl implements PassangersService {
	
	List<Passangers> pass=new ArrayList<>();
	
	int currentID=123;

	@Override
	public List<Passangers> getPassanger() {
		
		return pass;
	}

	@Override
	public Passangers addPassangers(Passangers passanger) {
		
		passanger.setId(currentID++);
		
		pass.add(passanger);
		return passanger;
	}

}
