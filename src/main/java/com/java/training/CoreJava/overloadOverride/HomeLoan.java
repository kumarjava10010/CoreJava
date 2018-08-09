package com.java.training.CoreJava.overloadOverride;

public class HomeLoan extends BankLoanSuperClass{
	
	@Override
	public double getInterestRate() {
		double interestRate = 3.5;
		//System.out.println("Home Interest Rate In Super Class : " + interestRate);
		return interestRate;
	}

}
