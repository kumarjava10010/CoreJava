package com.java.training.CoreJava;

public class ThisDemo {
	
	int id;
	String name;
	float fee;
	
	public ThisDemo(int id, String name, float fee) {
		
		System.out.println(id + " " + name + " " + fee);
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public void display() {
		
		// calling fuction show()
		this.show();

		// ThisDemo t1 = new ThisDemo();
		// t1.show();

		System.out.println("Inside display function");
		System.out.println(id + " " + name + " " + fee);

	}

	public void show() {
		
		System.out.println("Inside show funcion");
		
		System.out.println(id + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		
		ThisDemo t1 = new ThisDemo(111, "ankit", 5000f);

		// Passing Arguments to Java method

		t1.display();
	}

}
