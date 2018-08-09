package com.java.training.CoreJava;

public class StaticDemoEx {

	    // static method
	
	static int i = 10;
	static int j = 20;
	
	static int c;
	
	// static block
    static {
        System.out.println("Static block initialized.");
        c = i * j;
        System.out.println("Results: "+c);
        
    }

	
	    public static void m1()
	    {
	    	//int c= 1/0;
	        System.out.println("2 step: from m1");
	    }
	 
	    public static void main(String[] args)
	    {
	          // calling m1 without creating any object of class Test
	    		System.out.println("1 step ");
	           m1();
	           System.out.println("3 step ");
	    }
	}


