package com.example.mvcweb;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcweb.entity.Bus;

public interface BusRepo extends JpaRepository<Bus, Integer> {

}
