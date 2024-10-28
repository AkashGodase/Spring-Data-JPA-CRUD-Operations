package com.example.service;

import java.util.List;

import com.example.entities.Student;

public interface StudentService {

	public boolean addStudentDetails(Student std);

	public List<Student> getAllStudentDetails();

	public Student getStudentDetails(long id);

	public boolean updateStudentDetails(long id, float marks);

	public boolean deleteId(long id);
}
