package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Patient;

public interface reposPatient extends JpaRepository<Patient,Integer> {

}
