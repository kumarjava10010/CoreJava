package com.java.training.CoreJava.threads;

public class MyTableDemo {

	public static void main(String args[]) {
		MyTable obj = new MyTable();// only one object
		MyTableThread1 t1 = new MyTableThread1(obj);
		MyTableThread2 t2 = new MyTableThread2(obj);
		t1.start();
		t2.start();
		
	}
}
