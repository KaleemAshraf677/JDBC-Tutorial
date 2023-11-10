package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			 if(con==null) {
				  // Load the driver
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  // create a connection
		        con=DriverManager.getConnection("jdbc:mysql://localhost/college","root","root");
			  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
