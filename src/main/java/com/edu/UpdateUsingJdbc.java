package com.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateUsingJdbc {

	public static void main(String[] args) {
		try {
			  Connection con=ConnectionProvider.getConnection();
			  //create a querry
			  String q="UPDATE STUDENT2 SET name=?,marks=?,city=? WHERE rollno=?";
			  
			  Scanner sc= new Scanner(System.in);
			  
			  System.out.println("Enter Student2 rollno: where you want to update column: name,marks,city");
			  int rollno=sc.nextInt();
			  
			  System.out.println("Enter updated name: ");
			  String name=sc.next();
			  
			  System.out.println("Enter updated marks: ");
			  int marks=sc.nextInt();
			  
			  System.out.println("Enter updated city: ");
			  String city=sc.next();
			  
			  // get PreparedStatement object 
			  PreparedStatement pstmt=con.prepareStatement(q);
			  // set the value of querry
			  pstmt.setString(1, name);
			  pstmt.setInt(2, marks);
			  pstmt.setString(3,city);
			  pstmt.setInt(4, rollno);
			  
			  pstmt.executeUpdate();
			  System.out.println("values updated successfully in Student2 table in database......");
			  con.close(); 
			      
		  }catch(Exception e) {
			e.printStackTrace();
		}

	}

}
