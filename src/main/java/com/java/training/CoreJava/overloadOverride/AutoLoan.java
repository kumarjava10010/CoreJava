package com.java.training.CoreJava.overloadOverride;

public class AutoLoan extends BankLoanSuperClass{
	
	@Override
	public double getInterestRate() {
		double interestRate = 7.5;
		//System.out.println("Auto Interest Rate In Super Class : " + interestRate);
		return interestRate;
	}
	
	
	// Auto loan specific requiremnts 
	
	
	

}
