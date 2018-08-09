package com.java.training.CoreJava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;

		try {

			// String dbURL =
			// "jdbc:sqlserver://localhost:1433;databaseName=MyExample1?user=sa&password=Balakrishna";
			String dbURL = "jdbc:sqlserver://localhost:1433;instance=RAGHUMASQL;databaseName=MyExample1";

			String user = "sa";
			String pass = "Balakrishna";
			conn = DriverManager.getConnection(dbURL, user, pass);
			// conn = DriverManager.getConnection(dbURL);

			if (conn != null) {
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
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
