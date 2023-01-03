package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="clinicaldata")
@JsonIgnoreProperties({"patient"})
public class ClinicalData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String companentName;
	private String companentValue;
	private Timestamp mesuredDataTime;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id" ,nullable=false)
	private Patient patient;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanentName() {
		return companentName;
	}
	public void setCompanentName(String companentName) {
		this.companentName = companentName;
	}
	public String getCompanentValue() {
		return companentValue;
	}
	public void setCompanentValue(String companentValue) {
		this.companentValue = companentValue;
	}
	public Timestamp getMesuredDataTime() {
		return mesuredDataTime;
	}
	public void setMesuredDataTime(Timestamp mesuredDataTime) {
		this.mesuredDataTime = mesuredDataTime;
	}
	
	

}
