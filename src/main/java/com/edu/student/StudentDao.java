package com.edu.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static void insertStudentInDB(StudentsDetail s1) {    //StudentsDetail Class now perform as a datatype and s1 object is perform as a parameter.
		try {
			      Connection con=ConnectionProvider.getConnection();
			      // create a query
			   String q="INSERT INTO STUDENTS (name,marks,grade,city) VALUES(?,?,?,?)";
			   // get PreparedStatement 
			   PreparedStatement pstmt=con.prepareStatement(q);
			   //set the values of query
			   pstmt.setString(1, s1.getName());
			   pstmt.setInt(2, s1.getMarks());
			   pstmt.setString(3, s1.getGrade());
			   pstmt.setString(4, s1.getCity());
			   
			   pstmt.executeUpdate();
			   System.out.println("successfully added student details in database.......");
			   
		}catch(Exception e) {
			e.printStackTrace();
		}
}
public static void deleteStudentInDB(int rollno) {
		try {
		      Connection con=ConnectionProvider.getConnection();
		      // create a query
		   String q="DELETE FROM STUDENTS WHERE rollno=?";
		   // get PreparedStatement 
		   PreparedStatement pstmt=con.prepareStatement(q);
		   //set the values of query
		   
		   pstmt.setInt(1, rollno);
		   
		   pstmt.executeUpdate();
		   System.out.println("successfully delete student details in database.......");
		   
	}catch(Exception e) {
		e.printStackTrace();
	}	
}
public static void selectAllDetailsFromStudentsTable() {
	
		try {
		      Connection con=ConnectionProvider.getConnection();
		      // create a query
		   String q= "SELECT * FROM STUDENTS";
		   // create Statement using Connection object con.
		   Statement stmt=con.createStatement();
		   ResultSet set =stmt.executeQuery(q);
		   
		   while(set.next()) {
			   int rollno=set.getInt(1);   
			   String name=set.getString("name");
			   int marks=set.getInt(3);
			   String grade=set.getString(4);
			   String city=set.getString("city");
			   
			   System.out.println("rollno: "+rollno+ " name: "+name+" marks: "+marks+" grade: "+grade+" city: "+city);
			   System.out.println("---------------------------------------------------------");
		   }   
	   }catch(Exception e) {
		     e.printStackTrace();
	}
}
public static void updateStudentsValuesInDB(int rollno, String name) {
		
	try {
	      Connection con=ConnectionProvider.getConnection();
	      // create a query
	   String q="UPDATE STUDENTS SET name=? WHERE rollno=?";
	   // get PreparedStatement 
	   PreparedStatement pstmt=con.prepareStatement(q);
	   //set the values of query
	   
	     pstmt.setInt(1,name );
	   
	   pstmt.executeUpdate();
	   System.out.println("successfully delete student details in database.......");
	   
}catch(Exception e) {
	e.printStackTrace();
}	
	}

}
