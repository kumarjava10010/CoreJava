package com.java.training.CoreJava.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {

	static Properties prop;

	public static void main(String[] args) throws IOException {

		loadProperties();

		// get the property value and print it out
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));

		PropertiesDemo obj = new PropertiesDemo();
		boolean isApproved = obj.isLoanApproved(867);
		System.out.println("Is Loan Approved: " + isApproved);
		
		if(isApproved) {
			String intrate = prop.getProperty("interestRate");
			System.out.println(intrate);
		}
		
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "xxxxxx");
		prop.setProperty("dbpassword", "yyyyyyy");
		
		obj.writeProperties();

	}

	private boolean isLoanApproved(int creditScoreInput) {

		int score = Integer.parseInt(prop.getProperty("creditScore"));
		if (creditScoreInput >= score) {
			return true;
		} else {
			return false;
		}
	}

	private static void loadProperties() throws IOException {

		InputStream input = null;
		prop = new Properties();

		try {
			input = new FileInputStream("src/main/resources/application.properties");

			// load a properties file
			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}
	
	private void writeProperties() {
		
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("src/main/resources/db.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "xxxxxxx");
			prop.setProperty("dbpassword", "yyyyyy");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
