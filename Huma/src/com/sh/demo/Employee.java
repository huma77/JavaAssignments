package com.sh.demo;

public class Employee {
	String name;
	int salary;
	
	Employee (){
		System.out.println("in default");
	}
	
	Employee (String name, int salary) {
		System.out.println("in parameterised");
		this.name = name;
		this.salary = salary;
	}

	public void getDetails() {
		
	}

	public String greetMessage(String string) {
		return null;
	}
	
}