package com.java.training.CoreJava.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemoChecked {

	public static void main(String args[]) //throws IOException
	{
		FileInputStream fis = null;
		/*
		 * This constructor FileInputStream(File filename) throws FileNotFoundException
		 * which is a checked exception
		 */
		//fis = new FileInputStream("C:/myfile.txt");
		
		try{
		    fis = new FileInputStream("C:/myfile.txt"); 
		    
		    int k;

			/*
			 * Method read() of FileInputStream class also throws a checked exception:
			 * IOException
			 */
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			
			fis.close();
		    
		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		}catch(IOException ioe) {
			System.out.println("io exception");
		}catch(Exception ee) {
			
		}
		
		
		
		

		/*
		 * The method close() closes the file input stream It throws IOException
		 */
		
	}

}
