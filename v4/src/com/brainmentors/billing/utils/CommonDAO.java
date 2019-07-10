package com.brainmentors.billing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface CommonDAO extends ConfigReader {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		/*String dbUserid = "root" ;
		String dbPassword = "amit123456";
		String connectionString = "jdbc:mysql://localhost:3306/billingdb";
		*/
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName(rb.getString(DRIVER));
		System.out.println("Driver Loaded");
		con = DriverManager.getConnection(rb.getString(DBURL)
				,rb.getString(USERID),rb.getString(PWD));
		return con;
	}
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		String uid = "amit";
//		String pwd = "78979";
//		Connection con = null;
//		String dbUserid = "root";
//		String dbPassword = "amit123456";
//		String connectionString = "jdbc:mysql://localhost:3306/billingdb";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver Loaded");
//		con = DriverManager.getConnection(connectionString,dbUserid,dbPassword);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select userid from user_mst where userid='"+uid+"' and password='"+pwd+"'");
		System.out.println("Userid is "+uid);
		if(rs.next()) {
			System.out.println("Welcome "+uid);
		}
		else {
			System.out.println("Invalid Userid or Password");
		}
		rs.close();
		stmt.close();
		//con.close();
//		if(con!=null) {
//			System.out.println("Connection Created....");
//			//con.close();
//			//con.close();
//		}
		
	}*/

}
