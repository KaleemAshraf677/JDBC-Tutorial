package com.edu.student;

import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management App");
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Press 1 for Add student");
			System.out.println("Press 2 for Delete student");
			System.out.println("Press 3 for Update student");
			System.out.println("Press 4 for Select student");
			System.out.println("Press 5 for Exit App");
			
			int userChoice=sc.nextInt();
			
			if(userChoice==1) {
				//add student
				System.out.println("Enter Student name:");
				String name=sc.next();
				
				System.out.println("Enter Student marks:");
				int marks=sc.nextInt();
				
				System.out.println("Enter Student grade:");
				String grade=sc.next();
				
				System.out.println("Enter Student City:");
				String city=sc.next();
				
				// create object of  Class(StudentsDetail) 
				
				StudentsDetail s1=new StudentsDetail(name,marks,grade,city);
				
				StudentDao.insertStudentInDB(s1);
				
				System.out.println(s1.toString());   //even If you don't call toString() method it is automatically call for s1,s2.s3.... objects 
				
				
			}else if(userChoice==2) {
				//detete Student...
				
				System.out.println("Enter Student rollno:Which data you want to delete");
				int rollno=sc.nextInt();
				
				StudentDao.deleteStudentInDB(rollno);	
				
			}else if(userChoice==3) {
				//update in students table
				System.out.println("Enter Student rollno,Which data you want to update:");
				int rollno=sc.nextInt();
				System.out.println("Enter ColumnName where you want to update values,Please Choose Columns in Between: rollno,name,marks,grade,city");
				String columnName=sc.next();
				
				
				StudentDao.updateStudentsValuesInDB(rollno,columnName);
				
				
			}else if(userChoice==4) {
				// select students table
				
				StudentDao.selectAllDetailsFromStudentsTable();
				
			}else if(userChoice==5) {
				   //Exit App......
				    break;
			}else 
				System.out.println("Invalid Input:Please Choose right Input... ");
		}
		System.out.println("Thank You for Using my application....See you soon.....");

	}

}
