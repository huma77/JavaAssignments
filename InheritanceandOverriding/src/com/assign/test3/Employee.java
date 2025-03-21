package com.assign.test3;

public class Employee extends Person {
	double salary;
	String designation;
	public Employee(String name, int age, double salary, String designation) {
		super(name, age);
		this.salary = salary;
		this.designation = designation;
	}
	void printDetails() {
		System.out.println("Name "+name);
		System.out.println("Age"+ age);
		System.out.println("Salary"+salary);
		System.out.println("Designation"+designation);
	}
	
}
