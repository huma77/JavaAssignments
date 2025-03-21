package com.oops.basic;

public class Student {
	String studentName;
	String city;
	int studentId;
	Student(){
		
	}
	
	void printDetails() {
		System.out.println(studentName+ city +studentId );
	}
	String greet(String message) {
		return message;
	}
	
	Student(String studentName, int studentId, String city){
		this.studentName = studentName;
		this.studentId = studentId;
		this.city = city;
		
		
	}
}
