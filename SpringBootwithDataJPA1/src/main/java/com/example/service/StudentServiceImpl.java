package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Student;
import com.example.repository.Studentrepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Studentrepo studentrepo;

	@Override
	public boolean addStudentDetails(Student std) {

		boolean status = false;

		try {
			studentrepo.save(std);
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}

		return status;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		List<Student> all = studentrepo.findAll();

		return all;
	}

	@Override
	public Student getStudentDetails(long id) {

		Optional<Student> byId = studentrepo.findById(id);

		if (byId.isPresent()) {
			return byId.get();

		} else {
			return null;

		}
	}

	@Override
	public boolean updateStudentDetails(long id, float marks) {
		Student std = getStudentDetails(id);
		if (std != null) {
			std.setMarks(marks);
			studentrepo.save(std);
			return true;
		}

		return false;

	}

	@Override
	public boolean deleteId(long id) {

		boolean status = false;
		try {
			studentrepo.deleteById(id);
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}
}
