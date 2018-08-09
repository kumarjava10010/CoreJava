package com.java.training.CoreJava;

public class ThisDemoVariable {

	// Class instance variables
	int id;
	String name;
	float fee;

	ThisDemoVariable(int id, String name, float fee) {
		// local variable can be accessed in side the method
		
//		id = id;
//		name = name;
//		fee = fee;

		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(id + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		
		// Passing Arguments to Java Constructor
		ThisDemoVariable s1 = new ThisDemoVariable(111, "ankit", 5000f);
		ThisDemoVariable s2 = new ThisDemoVariable(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}