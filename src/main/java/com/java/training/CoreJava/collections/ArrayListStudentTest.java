package com.java.training.CoreJava.collections;

import java.util.ArrayList;

import com.java.training.CoreJava.Student;

public class ArrayListStudentTest {

	public static void main(String[] args) {

		// Creating user-defined class objects
		Student s1 = new Student(101, "Cahndu", "3010 Palno");
		Student s2 = new Student(102, "Praveen", "1010 Frisco");
		Student s3 = new Student(103, "John", "1234 Irving");
		
		//creating arraylist  
		  ArrayList<Student> stuList=new ArrayList<Student>();  
		  stuList.add(s1);//adding Student class object  
		  stuList.add(s2);  
		  stuList.add(s3);  
		  
		ArrayListStudentDemo studentDemoObj = new ArrayListStudentDemo();
		
		studentDemoObj.saveStudents(stuList);
	}

}
