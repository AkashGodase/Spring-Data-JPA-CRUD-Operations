package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Student;

public interface Studentrepo extends JpaRepository<Student, Long> {

	
}
