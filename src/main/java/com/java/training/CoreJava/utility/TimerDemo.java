package com.java.training.CoreJava.utility;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

	public static void main(String[] args) {
	      
	      // creating timer task, timer
	      TimerTask tasknew = new MyTimerTaskDemo();
	      
	      Timer timer = new Timer();

	      // scheduling the task at interval
	      // task - task to be scheduled.
	      // delay - delay in milliseconds before task is to be executed.
	      // period - time in milliseconds between successive task executions.
	      
	      timer.schedule(tasknew,1000, 10000);  
	      
	     // timer.scheduleAtFixedRate(tasknew,1000, 10000);      

	   }
	   // this method performs the task
	   
}
