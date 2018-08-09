package com.java.training.CoreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			// Step 1: Creating Connection Object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "kumarjava", "secret");
			
			// Step 2: Creating Statement Object
			stmt = conn.prepareStatement("INSERT INTO employe VALUES (?,?,?,?,?,?,?)");

			stmt.setInt(1, 101);// 1 specifies the first parameter in the query
			stmt.setString(2, "Robert");
			stmt.setString(3, "Smith");
			stmt.setString(4, "3011");
			stmt.setString(5, "Plano");
			stmt.setString(6, "TX");
			stmt.setString(7, "75055");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

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
