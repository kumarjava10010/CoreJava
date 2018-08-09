package com.java.training.CoreJava.threads;

public class BankWithdraw implements Runnable{

	BankBalance balance;

	public BankWithdraw(BankBalance balance) {

		this.balance = balance;
	}

	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name+" started");

		synchronized (balance) {
			try {
				System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
				balance.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " got notified from Deposit-Thread at time:" + System.currentTimeMillis());
			// process the message now
			System.out.println(name + " processed the balance withdraw Completed : " + balance.getBalanceAmount());
		}
	}
	
	 
}
