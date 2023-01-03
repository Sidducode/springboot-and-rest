package com.example.demo.patientRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Patient;



public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
