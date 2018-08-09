package com.java.training.CoreJava.exceptions;

import com.java.training.CoreJava.Student;

public class StudentTest {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		 
        try {
 
            Student student = manager.find(1);
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }

	}

}
