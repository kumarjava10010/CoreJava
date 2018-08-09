package com.java.training.CoreJava.collections;

import java.util.List;

import com.java.training.CoreJava.Student;

public class StudentDemo {

	public static void main(String a[]) {
		StudentManager manager = new StudentManager();
		String branchName = "exce";

		List<Student> stuList = manager.getStudentList(branchName);

		if (stuList.isEmpty()) {
			System.out.println("*** NO Students Found for Barch " + branchName);
		}
		{

			for (Student stu : stuList) {
				System.out.println(stu.getId());
				System.out.println(stu.getName());
				System.out.println(stu.getAddress());
				System.out.println("_____________");
			}
		}

	}

}
