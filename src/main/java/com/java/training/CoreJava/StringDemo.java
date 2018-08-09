/**
 * 
 */
package com.java.training.CoreJava;

/**
 * @author kmoparti This is String demo class
 *
 */
public class StringDemo {
	
	// Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
        System.out.println("String S1 concat1 Method : " + s1); // Output: Geeksforgeeks
    }

    public static void main(String[] args)
    {
        String s1 = "Geeks";
        
        concat1(s1);  // s1 is not changed
        
        System.out.println("String S1 in Main Method: " + s1); // Output: Geeks

    }
}