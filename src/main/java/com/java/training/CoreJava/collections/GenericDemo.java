package com.java.training.CoreJava.collections;

import java.util.Hashtable;

public class GenericDemo<T> {
	
	// A Generic method example
    public void genericDisplay (T element)
    {
        System.out.println(element.getClass().getName() +
                           " = " + element);
        
    }
  
    // Driver method
    public static void main(String[] args)
    {
    	
    	GenericDemo obj = new GenericDemo();
         // Calling generic method with Integer argument
    	obj.genericDisplay(11);
  
        // Calling generic method with String argument
    	obj.genericDisplay("GeeksForGeeks");
  
        // Calling generic method with double argument
    	obj.genericDisplay(1.0);
    }
}
