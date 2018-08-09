package com.java.training.CoreJava.overloadOverride;

public class BankTest {

	public static void main(String[] args) {

		BankLoanSuperClass superObj = new BankLoanSuperClass();
		AutoLoan autoObj = new AutoLoan();
		HomeLoan homeObj = new HomeLoan();
		
		double bankRate = superObj.getInterestRate();
		System.out.println(" Rate from bank "+bankRate);
		
		double autoRate = autoObj.getInterestRate();
		System.out.println("Auto rate "+autoRate);
		
		double homeRate = homeObj.getInterestRate();
		System.out.println("Home Rate "+homeRate);
		
		double autoEmi = autoObj.getMothlyEmi(10000, autoRate, 24);
		System.out.println("Auto Monthly EMI is :" +autoEmi+"\n");
		
		double homeEmi = homeObj.getMothlyEmi(100000, homeRate, 240);
		System.out.println("Home Monthly EMI is :" +homeEmi+"\n");
	}

}
