package com.assign.test6;

public class Student {
	String name;
	int id;
	String course;
	public Student(String name, int id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}
	void printDetails() {
		System.out.println("Student Details: ");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Course: "+course );
	}
}
