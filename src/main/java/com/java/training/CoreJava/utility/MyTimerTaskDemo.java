package com.java.training.CoreJava.utility;

import java.util.Date;
import java.util.TimerTask;

public class MyTimerTaskDemo extends TimerTask {

	@Override
	public void run() {
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
	      System.out.println("------------------------");

	}

	private void completeTask() {
		try {
			// assuming it takes 20 secs to complete the task
			System.out.println("Task executing");

			// YOUR CODE LOGIC EXECUTION

			System.out.println("Task COMPLETED");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
