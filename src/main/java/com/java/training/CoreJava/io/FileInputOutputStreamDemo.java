package com.java.training.CoreJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamDemo {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("\\Users\\kmoparti\\Documents\\Java Training\\test123.txt");
			
			String s="Welcome to javaTpoint. this is first File Stream Program";    
            
			byte b[]=s.getBytes();//converting string into byte array    
            
			fout.write(b);    
            
			fout.close(); 
            
			System.out.println("success...");
			
			
			// read From file: 
			
			 FileInputStream fin=new FileInputStream("\\Users\\kmoparti\\Documents\\Java Training\\test123.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
//	            	System.out.println(i);
//	            	System.out.println("");
	             System.out.print((char)i); 
//	            	System.out.println("");

	            }    
	            fin.close();    
	            
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
