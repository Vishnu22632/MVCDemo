package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {

		addBtn();
		getAll();
		deleteBtn();
		System.out.println();
		System.out.println("**************Remaining student**************");
		getAll();
		

	}
	
	static void addBtn() {
		
		StudentService ss=new StudentServiceImpl();
		char flag='y';
		
		do {
			Student s=new Student();
			Scanner scn=new Scanner(System.in);
			
			System.out.println("Enter Student Id : ");
			s.setId(scn.nextInt());
			
			System.out.println("Enter Student Name : ");
			s.setName(scn.next());
			
			System.out.println("Enter Student address : ");
			s.setAddress(scn.next());
			
			System.out.println("Enter Student Age : ");
			s.setAge(scn.nextInt());
			
			
			
			ss.addStudent(s);
			
			System.out.println("do you want to add more [y/n] ");
			flag=scn.next().charAt(0);
			
			
		} while (flag=='y');	
		
	}
	
	static void deleteBtn() {
		StudentService ss=new StudentServiceImpl();
		ss.deleteStudent(0);
	}
	
	
	static void getAll() {
			StudentService ss=new StudentServiceImpl();
			List<Student> list=ss.getAllStudent();
			System.out.println(list);
	}

}
