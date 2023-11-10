package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CreateTableUsingJdbc {

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
			String q="CREATE TABLE STUDENT2(rollno int primary key auto_increment,name varchar(50) not null,marks int not null,city varchar(40) not null)";
			// create a statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("successfully table created in  Mysql database......");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();		}
	}

   }
