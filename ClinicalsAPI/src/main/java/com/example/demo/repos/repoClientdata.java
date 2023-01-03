package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ClinicalData;

public interface repoClientdata extends JpaRepository<ClinicalData, Integer> {

}
