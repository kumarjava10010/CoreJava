package com.java.training.CoreJava.overloadOverride;

public class BankLoanSuperClass {

	public double getInterestRate() {
		double interestRate = 2.5;
		//System.out.println("Default Interest Rate In Super Class : " + interestRate);
		return interestRate;
	}
	
	public void saveCustomerDetails(Customer customer) {
		
		//Calling Database and passing Customer Object
		
		System.out.println("Customer Details Saved in Database");
	}
	
	public double getMothlyEmi(double principal, double rate, int term) {
		// Some calculation 
		
		rate = rate/(12*100); //one month interest
	    
	    double emi = (principal*rate*Math.pow(1+rate, term))/(Math.pow(1+rate, term)-1);
	    //System.out.println("Monthly EMI is :" +emi+"\n");
	    
	    return emi;
		
	}

}
