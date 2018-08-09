package com.java.training.CoreJava.threads;

public class BankDeposit implements Runnable{

	BankBalance balance;

	public BankDeposit(BankBalance balance) {

		this.balance = balance;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (balance) {
            	balance.setBalanceAmount(10000);
            	balance.notify();
                // msg.notifyAll();
                System.out.println(name+" Deposit Completed");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }		
	}

}
