package com.java.training.CoreJava.collections;

import java.util.List;

import com.java.training.CoreJava.Student;

public class ArrayListStudentDemo {

	//Test method 123
	public String saveStudents(List<Student> studentList) {
		//Generics
		// this is foreach loop
		for (Student student : studentList) {
			System.out.println("Calling Dataabse to Save STUDENT table");
			System.out.println(student.getId()+" | "+student.getName() +" | "+student.getAddress());
		}
		
		return "Success";
	}

}
