package com.java.training.CoreJava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	
	 public static void main(String[] args) throws IOException
	    {
		 BufferReaderDemo BufferedReaderDemo = new BufferReaderDemo();
	        BufferedReaderDemo.readFile();
	    }

	    private void readFile() throws IOException
	    {
	        FileReader fileReader = null;
	        BufferedReader bufferedReader = null;

	        try
	        {
	            fileReader = new FileReader("\\Users\\kmoparti\\Documents\\Java Training\\test.txt");
	            bufferedReader = new BufferedReader(fileReader);

	            String line = null;
	            /*
	             * Reads a line of text. A line is considered to
	             * be terminated by any one of a line feed
	             * ('\n'), a carriage return ('\r'), or a
	             * carriage return followed immediately by a
	             * linefeed.
	             */
	            while ((line = bufferedReader.readLine()) != null)
	            {
	                System.out.println(line);
	            }
	        }
	        finally
	        {
	            if (fileReader != null)
	            {
	                fileReader.close();
	            }
	            if (bufferedReader != null)
	            {
	                bufferedReader.close();
	            }
	        }
	    }

	}
