package com.java.training.CoreJava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		Statement stmt = null;

		try {
			//Step 1:  Creating Connection Object
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "kumarjava", "secret");
			 //Step 2:  Creating Statement Object
		      stmt = conn.createStatement();


			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
				
			}
			
			String sqlInsert = "INSERT INTO employe " +
	                   "VALUES (103, 'JAMES103', 'SMITH103', '12341', 'Irving', 'TX', '75012')";
			
			String sqlInsert2 = "INSERT INTO employe " +
	                   "VALUES (104, 'JAMES104', 'SMITH103', '12341', 'Irving', 'TX', '75012')";

			
			String sqlInsert3 = "INSERT INTO employe " +
	                   "VALUES (105, 'JAMES103', 'SMITH103', '12341', 'Irving', 'TX', '75012')";


			//Step 3: Executing Statement
			
			stmt.execute(sqlInsert);
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

}
