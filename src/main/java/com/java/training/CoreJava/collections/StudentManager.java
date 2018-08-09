package com.java.training.CoreJava.collections;

import java.util.ArrayList;
import java.util.List;

import com.java.training.CoreJava.Student;

public class StudentManager {
	
	public List<Student> getStudentList(String branch){
		
		// call DB to get all the students based on branch
		
		List<Student> studentList = new ArrayList<Student>();
		
		//DB
		//For(){studentList.add(obj);}
		
		if(branch.equals("cse")) {
			Student stu1 = new Student(100, "John", "Dallas");
			Student stu2 = new Student(101, "Chris", "Irving");
			Student stu3 = new Student(102, "Tom", "Plano");
			Student stu4 = new Student(103, "David", "Frisco");
			Student stu5 = new Student(104, "John", "Dallas");

			studentList.add(stu1);
			studentList.add(stu2);
			studentList.add(stu3);
			studentList.add(stu4);
			studentList.add(stu5);
		}
		
		return studentList;
		
	}

}
