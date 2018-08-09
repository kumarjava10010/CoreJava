package com.java.training.CoreJava.threads;

public class MyTable {
	
	public  void printTable(int n) {
	//public void printTable(int n) {// method not synchronized
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(n+" * "+i+" = "+n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}