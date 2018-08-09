package com.java.training.CoreJava.threads;

public class ThreadRunnable implements Runnable{
	
	String name = null;
	public ThreadRunnable(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Runnable thread "+name+" is running...");

		for (int x = 1; x <= 10; x++) {
		      System.out.println("Thread "+name+"  x Value: "+x);
		      
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    }
		// Your Business Logic is Here
		
		System.out.println("Runnable thread is Ended...");		
	}

}
