package com.inheritance.demos;

public class InherDemo {

	public static void main(String[] args) {

		Employee emp = new Employee("Ram",10);
		emp.getDetails();
		
		Manager man = new Manager("Tom",20,9000);
		man.getDetails();
		man.calcBonus(2);
	}

}
