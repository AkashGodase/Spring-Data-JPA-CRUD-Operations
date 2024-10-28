package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entities.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootwithDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootwithDataJpa1Application.class, args);

		StudentService bean = context.getBean(StudentServiceImpl.class);

		// ------Insert Operation---------//
		/*
		 * Student s = new Student(); s.setName("bhau"); s.setRollno(102);
		 * s.setMarks(88.4f);
		 * 
		 * boolean studentDetails = bean.addStudentDetails(s);
		 * 
		 * if (studentDetails) { System.out.println("student inserted successfully");
		 * 
		 * } else { System.out.println("student not inserted"); }
		 */

		// --------select operation----------//

		/*
		 * List<Student> allStudentDetails = bean.getAllStudentDetails(); for (Student
		 * st : allStudentDetails) { System.out.println("id " + st.getId());
		 * System.out.println("name " + st.getName()); System.out.println("rollno " +
		 * st.getRollno()); System.out.println("marks " + st.getMarks());
		 * 
		 * System.out.println("-----------------------"); }
		 */
		// ----------select operation(for 1 id) ----------------
		/*
		 * Student st = bean.getStudentDetails(2); if (st != null) {
		 * System.out.println("id " + st.getId()); System.out.println("name " +
		 * st.getName()); System.out.println("rollno " + st.getRollno());
		 * System.out.println("marks " + st.getMarks()); } else {
		 * System.out.println("student not found");
		 * 
		 * }
		 */
		// ----------update student-------------//

		/*
		 * boolean updateStudentDetails = bean.updateStudentDetails(1, 45.3f); if
		 * (updateStudentDetails) {
		 * System.out.println("student details update successfully"); } else {
		 * System.out.println("something went wrong"); }
		 */
		/*
		 * boolean deleteId = bean.deleteId(5); if (deleteId) {
		 * System.out.println("deleted successfully");
		 * 
		 * } else { System.out.println("Details not deleted"); }
		 */
	}

}
