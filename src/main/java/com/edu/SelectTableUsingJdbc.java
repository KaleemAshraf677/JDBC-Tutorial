package com.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectTableUsingJdbc {

	public static void main(String[] args) {
		try {
			 Connection con=ConnectionProvider.getConnection();
			 //create a query
			 String query="SELECT * FROM Student2";
			 //create statement
			Statement stmt=con.createStatement();
			ResultSet set =stmt.executeQuery(query);
			
			while(set.next()) {
				int rollno=set.getInt(1);
				String name=set.getString(2);
				int marks=set.getInt("marks");
				String city=set.getString("city");
				System.out.println(rollno+":" +name+":" +marks+ ":"+city);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
