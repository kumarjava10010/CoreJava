package com.java.training.CoreJava;

public class Calculator {
	
	
	public int add(int i, int j) {
	
		return i+j;
	}
	
	public double add(double i, double j) {
		
		return i+j;
	}

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();

		System.out.println("result : "+obj.add(10.56, 10.78));
	}

}
