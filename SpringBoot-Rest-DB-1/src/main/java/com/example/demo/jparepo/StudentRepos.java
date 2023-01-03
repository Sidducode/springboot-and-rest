package com.example.demo.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;


public interface StudentRepos extends JpaRepository<Student, Integer> {

}
