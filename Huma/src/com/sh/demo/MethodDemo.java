package com.sh.demo;

public class MethodDemo {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.name="Ram";
		employee.salary=3000;
		
		employee.getDetails();
		String msg = employee.greetMessage("Have a good day");
		System.out.println(msg);
		
		
		Employee employee1 = new Employee();
		employee1.name="Jack";
		employee1.salary=4000;
		
		employee1.getDetails();
		System.out.println(employee1.greetMessage("Welcome to java"));
	}
}
