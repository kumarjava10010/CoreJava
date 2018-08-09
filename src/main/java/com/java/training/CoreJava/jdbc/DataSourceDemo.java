package com.java.training.CoreJava.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceDemo {

	public static void main(String[] args) {

		DataSource ds = null;
		if("mysql".equals("mysql")){
			ds = getMySQLDataSource();
		}else if("oracle".equals("")){
			ds = getOracleDataSource();
		}else{
			System.out.println("invalid db type");
			return;
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Employe");
			while(rs.next()){
				System.out.println("Employee ID="+rs.getInt(1)+", Name="+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public static DataSource getMySQLDataSource() {
		MysqlDataSource mysqlDS = null;
		try {
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL("jdbc:mysql://localhost:3306/java_db");
			mysqlDS.setUser("kumarjava");
			mysqlDS.setPassword("secret");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}

	public static DataSource getOracleDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		//OracleDataSource oracleDS = null;
		try {
			fis = new FileInputStream("db.properties");
			props.load(fis);
			/*oracleDS = new OracleDataSource();
			oracleDS.setURL(props.getProperty("ORACLE_DB_URL"));
			oracleDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
			oracleDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));*/
		} catch (IOException e) {
			e.printStackTrace();
		} 
		//return oracleDS;
		
		return null;
	}

}
