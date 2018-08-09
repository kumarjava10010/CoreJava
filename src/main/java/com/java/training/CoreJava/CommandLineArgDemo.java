package com.java.training.CoreJava;

public class CommandLineArgDemo {

	public static void main(String[] args) {
		// check if length of args array is greater than 0
        if (args.length > 0)
        {
            System.out.println("The command line arguments are:");
 
            // iterating the args array and printing the command line arguments
            for (int i = 0; i<args.length ; i++)
                System.out.println(args[i]);
        }
        else
            System.out.println("No command line arguments found.");
    }

}
