package com.classesobjects.basic;

public class Employee {
	String name;
	int salary;
	
	Employee(String n, int s){
		name = n;
		salary = s;
	}

	void getDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
	}
	
	String greetMessage(String msg){
		return "Welcome "+ msg;
	}
	
}
