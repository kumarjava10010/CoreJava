package com.java.training.CoreJava.exceptions;

public class ExceptionDemoUnChecked {

	public static void main(String args[])
	   {
		int num1=10;
		int num2=0;
		/*Since I'm dividing an integer with 0
		 * it should throw ArithmeticException
	         */
		//Ex 1
		try {
			int res=num1/num2;
			System.out.println(res);
			
			// save emp
			// save dept
			//save sal --> error
			
		}catch(ArithmeticException exxxx) {
			exxxx.printStackTrace();
			System.out.println("I got exception ");
			// rollback emp
			// rollback dept
		}
		
		System.out.println("After dividing --- ");
		System.out.println("");
		//Ex 2
		int arr[] ={1,2,3,4,5};
		System.out.println(arr[4]);
	   }
}
