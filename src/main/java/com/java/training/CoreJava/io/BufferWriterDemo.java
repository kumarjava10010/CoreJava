package com.java.training.CoreJava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo extends BufferReaderDemo{
	
	/*public static void main(String[] args) throws IOException
    {
		BufferWriterDemo BufferedWriterDemo = new BufferWriterDemo();
        BufferedWriterDemo.writeFile();
    }*/
	
	/*public BufferWriterDemo(String fileName)  throws Exception{
		
		System.out.println(""+fileName.length());
		
	}*/

    private void writeFile() throws IOException
    {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try
        {
            fileWriter = new FileWriter("myoutputfile.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            String line1 = "Peter is going to India.";
            String line2 = "John is going to India.";

            // writing string to writer
            bufferedWriter.write(line1);
            bufferedWriter.newLine();
            bufferedWriter.write(line2);

            // forces out the characters to file writer
            bufferedWriter.flush();
            System.out.println("Sucessfully written to the file,"
                    + " please check the file content.");

        }
        finally
        {
            if (fileWriter != null)
            {
                fileWriter.close();
            }
            if (bufferedWriter != null)
            {
                bufferedWriter.close();
            }
        }
    }

}

