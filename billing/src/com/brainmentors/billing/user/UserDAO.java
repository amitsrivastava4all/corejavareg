package com.brainmentors.billing.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.brainmentors.billing.utils.CommonDAO;

public class UserDAO {
	public boolean loginCheck(String uid, String pwd) throws ClassNotFoundException, SQLException {
		//String uid = "amit";
		//String pwd = "78979";
		ResultSet rs = null;
		Connection con = null;
		Statement stmt = null;
		try {
		con = CommonDAO.getConnection();

		stmt = con.createStatement();
		rs = stmt.executeQuery("select userid "
				+ "from user_mst where "
				+ "userid='"+uid+"' and "
						+ "password='"+pwd+"'");
		System.out.println("Userid is "+uid);
		if(rs.next()) {
			return true;
			//System.out.println("Welcome "+uid);
		}
		else {
			return false;
			//System.out.println("Invalid Userid or Password");
		}
		}
		finally {
		rs.close();
		stmt.close();
		//con.close();
		}
		
	}

}
