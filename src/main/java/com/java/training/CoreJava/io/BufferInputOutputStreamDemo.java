package com.java.training.CoreJava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputOutputStreamDemo {

	public static void main(String args[]) throws Exception {

		FileOutputStream fout = null;
		BufferedOutputStream bout = null;

		FileInputStream fin = null;
		BufferedInputStream bin = null;

		try {
			fout = new FileOutputStream("\\Users\\kmoparti\\Documents\\Java Training\\test-buffer.txt");

			bout = new BufferedOutputStream(fout);
			
			String s = "Welcome to javaTpoint.";
			
			byte byteArray[] = s.getBytes();
			
			bout.write(byteArray);
			
			/*
             * Writes len bytes from the specified byte
             * array starting at offset off to this buffered
             * output stream.
             */
			//bout.write(byteArray, 18, 5);

			/*
			 * Flushes this buffered output stream. This forces any buffered output bytes to
			 * be written out to the underlying output stream.
			 */
			bout.flush();
			
			System.out.println("success");

			// Ex 2 Bufferoutput Stream

			fin = new FileInputStream("\\Users\\kmoparti\\Documents\\Java Training\\test-buffer.txt");
			bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			if (fout != null) {
				fout.close();
			}
			if (bout != null) {
				bout.close();
			}

			if (bin != null) {
				bin.close();
			}
			if (fin != null) {
				fin.close();
			}
		}

	}
}
