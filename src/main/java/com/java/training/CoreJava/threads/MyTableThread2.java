package com.java.training.CoreJava.threads;

public class MyTableThread2 extends Thread {

	MyTable t;

	MyTableThread2(MyTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}

}
