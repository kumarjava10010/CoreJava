package com.java.training.CoreJava.io;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo extends Thread{

	static int size = 0;
	static XSSFSheet myExcelSheet = null;

	public static void main(String a[]) throws IOException {
		ExcelDemo obj = new ExcelDemo();
		// obj.readFromExcel("C:\\workspace-mvc\\test.xlsx");

		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream("C:\\workspace-mvc\\test.xlsx"));

		myExcelSheet = myExcelBook.getSheet("Sheet1");

		// Iterator<Row> rowIterator = myExcelSheet.rowIterator();

		size = myExcelSheet.getLastRowNum();
		// size = myExcelSheet.getPhysicalNumberOfRows();

		Thread t1 = new Thread("t1");
		Thread t2 = new Thread("t2");
		
		t1.start();
		t2.start();

		t1.run();
		t2.run();
		
		System.out.println(size);

		myExcelBook.close();
	}

	@Override
	public void run() {

		DataFormatter dataFormatter = new DataFormatter();
		
		int maxSize =  myExcelSheet.getPhysicalNumberOfRows();

			 size = size + maxSize/2;
		
		

		for (int i = size; i < size; i++) {
			Row row = myExcelSheet.getRow(i);
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}
	}

}
