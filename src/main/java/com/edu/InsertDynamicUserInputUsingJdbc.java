package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicUserInputUsingJdbc {

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
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter marks: ");
			int marks=sc.nextInt();
			
			System.out.println("Enter city: ");
			String city=sc.next();
			
		   //set the value of querry
			pstmt.setString(1,name);
			pstmt.setInt(2,marks);
			pstmt.setString(3,city);
			
			pstmt.executeUpdate();
			System.out.println("successfully values Inserted in table Student2 in database......");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();	
		}
	}

}


