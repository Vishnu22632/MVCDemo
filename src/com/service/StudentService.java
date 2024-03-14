package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	
	void addStudent(Student student);
	
	void deleteStudent(int index);
	
	List<Student> getAllStudent();
}
