package com.sammyGoJs.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sammyGoJs.student.dal.entities.Student;
import com.sammyGoJs.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("John");
		student.setCourse("Java WEB");
		student.setFees(30d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findById(3l).get();
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(3l).get();
		student.setFees(40d);
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(3l);
		studentRepository.delete(student);
	}
}
