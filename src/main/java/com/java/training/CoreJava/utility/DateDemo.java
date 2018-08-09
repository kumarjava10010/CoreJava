package com.java.training.CoreJava.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;

public class DateDemo {

	public static void main(String args[]) {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date using toString()
		System.out.println("Default Date Format " + date.toString());

		DateDemo obj = new DateDemo();

		//obj.dateFormatDemo();
		
		try {
			obj.dateFormatDemo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void dateCompareDemo() throws ParseException {

		// Old date
 		Date date3 = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2009-12-31");
		Date date2 = sdf.parse("2019-01-31");

		if (date1.compareTo(date2) > 0) {
			System.out.println("Date1 is after Date2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date1 is before Date2");
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 is equal to Date2");
		} else {
			System.out.println("How to get here?");
		}
		
		// before and After
		System.out.println("*****************************");
		
		if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        }

        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        }

        if (date1.equals(date2)) {
            System.out.println("Date1 is equal Date2");
        }
        
     // Equals Method
     		System.out.println("*****************************");
     		Date date4 = new Date();
     		System.out.println("Date 3: "+date3.getTime());
     		System.out.println("Date 4: "+date4.getTime());

     		if (date3.equals(date4)) {
     			System.out.println("Both are equal");
     		}

	}

	private void dateFormatDemo() {

		Date today = new Date();

		// Date with Format
		System.out.println("-----------------------------------");

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		String newToday = format.format(today);

		System.out.println("Formated Date: " + newToday);

		// Date Time
		System.out.println("-----------------------------------");

		SimpleDateFormat format1 = new 
				SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		System.out.println("Formated Date Time: " + format1.format(today));

		// bad Format
		System.out.println("------------------------------------");

		SimpleDateFormat format2 = new SimpleDateFormat("DD-MM-yyyy");

		System.out.println("bad Date Format: " + format2.format(today));

		System.out.println("------------------------------------");
		// String to Date
		SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yyyy");
		Date dateFromString = null;
		try {
			dateFromString = format3.parse("30/07/2017");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Date From String is: " + dateFromString);

	}

}
