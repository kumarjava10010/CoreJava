package com.java.training.CoreJava.overloadOverride;

public class OverloadingExample {

	public static int sumOf(int a, int b) {
		return a + b;
	}

	public static int sumOf(int a, int b, int c) {
		return a + b + c;
	}

	public static double sumOf(double a, double b) {
		return a + b;
	}

	public static double sumOf(double a, double b, double c) {
		//
		return a + b + c;
	}

	public static void main(String[] args) {
		
		System.out.println(sumOf(1, 2));
		
		System.out.println(sumOf(10d, 20d, 30d));
	}
}
