package com.java.training.CoreJava.threads;

public class MyTableThread1 extends Thread {

	MyTable t;

	MyTableThread1(MyTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(512);
	}

}
