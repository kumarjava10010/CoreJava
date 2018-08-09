package com.java.training.CoreJava.exceptions;

import com.java.training.CoreJava.Student;

public class StudentManager {
	public Student find(int studentID) throws StudentNotFoundException {
		
		// Connect to data base and get the student data
		
		if (studentID == 123456) {
			Student student = new Student();
			
			student.setId(123456);
			student.setName("John");
			
			return student;
		} else {
			throw new StudentNotFoundException("Could not find student with ID " + studentID);
		}
	}
}
