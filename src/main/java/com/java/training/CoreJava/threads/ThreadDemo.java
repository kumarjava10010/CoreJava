package com.java.training.CoreJava.threads;

public class ThreadDemo {

	public static void main(String args[]) {
		ThreadExtends t1 = new ThreadExtends("A");
		
		
		ThreadRunnable runObj=new ThreadRunnable("B");  
		Thread t2 =new Thread(runObj);  
		
		t1.start(); 

		t2.start();
		
		
		
	}
}
