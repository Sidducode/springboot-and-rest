package com.example.demo.model;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {
	
	@Id
	private int id;
	private String name;
	private String description;
	private int price;
	
	
	
	

}
