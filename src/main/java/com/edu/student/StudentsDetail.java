package com.edu.student;

import java.util.Scanner;

public class StudentsDetail {
	private int rollno;
	private String name;
	private int marks;
	private String grade;
	private String city;
	
	
   StudentsDetail(String name, int marks, String grade, String city) {
		this.name = name;
		this.marks = marks;
		this.grade = grade;
		this.city = city;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getGrade() {
		return grade;
	}
	public String getCity() {
		return city;
	}

	@Override     // it is come from build-In Exception Class
	public String toString() {
		return "StudentsDetail [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", grade=" + grade
				+ ", city=" + city + "]";
	}

		
}
