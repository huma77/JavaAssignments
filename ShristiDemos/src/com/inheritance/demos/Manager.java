package com.inheritance.demos;

public class Manager extends Employee {
	int salary;
	
	
	public Manager(String name, int empId, int salary) {
		super(name,empId);
		System.out.println(this.name+this.empId);
		this.salary = salary;
	}
	void calcBonus(int a){
		System.out.println("Bonus "+salary*a);
	
	}

}
