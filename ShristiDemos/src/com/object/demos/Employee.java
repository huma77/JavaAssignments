package com.object.demos;

public class Employee {

	String name;
	int salary;
	
	Employee(){
		System.out.println("in default");
		
	}
	
	Employee(String name,int salary){
		System.out.println("in para");
		this.name=name;
		this.salary=salary;
	}
	
	void getDetails(){
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	
	String greetMessage(String msg){
		return msg;
	}

}
