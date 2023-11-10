package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertTableUsingJdbc {

	public static void main(String[] args) {
		try {
		     //Load the driver
		       Class.forName("com.mysql.cj.jdbc.Driver");
		     // create a Connection
		     String url="jdbc:mysql://localhost:3306/college";
		     String username="root";
		     String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			//create a Querry
			String q="INSERT INTO STUDENT2(name,marks,city) VALUES(?,?,?)";
			// get PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the value of querry
			pstmt.setString(1,"Amman Siddique");
			pstmt.setInt(2,75);
			pstmt.setString(3,"Lucknow");
			
			pstmt.executeUpdate();
			System.out.println("successfully Inserted values in Student2 table in database......");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();		}
	}

	}


