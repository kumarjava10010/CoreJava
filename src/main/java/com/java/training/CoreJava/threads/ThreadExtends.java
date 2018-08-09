package com.java.training.CoreJava.threads;

public class ThreadExtends extends Thread {

	String name = null;

	public ThreadExtends(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Extending thread is running...");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread " + name + "  i Value: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Your Business Logic is Here

		System.out.println("Extending thread is Ended...");

	}

}