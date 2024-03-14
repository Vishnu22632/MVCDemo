package com.service;

import java.util.LinkedList;
import java.util.List;

import com.model.Student;

public class StudentServiceImpl implements StudentService {

	public static List<Student> sList=new LinkedList<Student>();
	
	@Override
	public void addStudent(Student student) {
		sList.add(student);
		
		System.out.println("Student added successful......");
		System.out.println("Number of Student is : "+sList.size());
		
	}

	@Override
	public void deleteStudent(int index) {
		
		sList.remove(index);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return sList;
		
	}

}
