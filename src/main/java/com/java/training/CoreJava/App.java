package com.java.training.CoreJava;

/**
 * Hello world!
 *
 */
public class App {
	
	final int i = 10;
	
	Integer a = new Integer(100);
	Integer b = new Integer(200);
	
	static int x =100;
	
	public void test() {
		x = x=10;
		
		int m = a.intValue();
		
		System.out.println(i);

	}
	public static void main(String[] args) {
		
		Integer x = new Integer(100);
		Integer y = new Integer(200);
		
		System.out.println(x.compareTo(y));
		System.out.println(x.compare(x, y));
		
		/*String firstName = null;
		x = x +20;
		
		if(firstName.length()>0) {
			System.out.println(firstName);
		}
		
		System.out.println("Hello World!");
		System.out.println(true);

		Integer ageObj = new Integer(30);
		System.out.println(ageObj instanceof Integer); // true
		//System.out.println(ageObj instanceof String);
		final int max;
		max = 100; 
		System.out.println(max);
*/
	}
}
