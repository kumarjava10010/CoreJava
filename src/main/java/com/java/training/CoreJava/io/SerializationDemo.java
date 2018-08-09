package com.java.training.CoreJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	 public static void main(String[] args)
	    {   
	        Employee empObj = new Employee(1, "StageIT Employee");
	        
	        String filename ="\\Users\\kmoparti\\Documents\\Java Training\\emoSer.ser";
	         
	        // Serialization 
	        try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(empObj);
	             
	            out.close();
	            file.close();
	             
	            System.out.println("Object has been serialized");
	 
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	 
	 
	        Employee empObj2 = null;
	 
	        // Deserialization
	        try
	        {   
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	             
	            // Method for deserialization of object
	            empObj2 = (Employee)in.readObject();
	             
	            in.close();
	            file.close();
	             
	            System.out.println("Object has been deserialized ");
	            System.out.println("a = " + empObj2.getEmpID());
	            System.out.println("b = " + empObj2.getEmpName());
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	         
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
	 
	    }
	}
