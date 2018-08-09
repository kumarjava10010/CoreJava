package com.java.training.CoreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		Statement stmt = null;

		try {
			// Step 1: Creating Connection Object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "kumarjava", "secret");
			// Step 2: Creating Statement Object
			stmt = conn.createStatement();

			String sql = "SELECT * FROM Employe";
			 
			
			ResultSet result = stmt.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    int empid = result.getInt(1);
			    String lastname = result.getString(2);
			    String firstname = result.getString(3);
			    String address = result.getString(4);
			    String city = result.getString(5);
			    String zipcode = result.getString(6);

			 
			    System.out.println(empid+" "+lastname+" "+firstname+" "+address+" "+city+" "+zipcode);
			}


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
