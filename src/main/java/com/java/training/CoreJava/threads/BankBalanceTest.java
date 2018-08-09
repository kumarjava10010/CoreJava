package com.java.training.CoreJava.threads;

public class BankBalanceTest {

	public static void main(String[] args) {
		BankBalance myBalance = new BankBalance();

		BankWithdraw waiter = new BankWithdraw(myBalance);

		Thread t1 = new Thread(waiter, "Withdraw-Thread");
		t1.start();

		BankDeposit notifier = new BankDeposit(myBalance);

		Thread t2 = new Thread(notifier, "Deposit-Thread");

		t2.start();

		System.out.println("All the threads are started");
	}

}
