package com.object.demos;

public class ConstDemo {

	public static void main(String[] args) {

		
		Employee employee = new Employee("Ram",1000);
		employee.getDetails();
		String msg = employee.greetMessage("Have a good day");
		System.out.println(msg);
		
		
		Employee employee1 = new Employee("Tom",2001);
		employee1.getDetails();
		System.out.println(employee1.greetMessage("Welcome to java"));
	}

}
