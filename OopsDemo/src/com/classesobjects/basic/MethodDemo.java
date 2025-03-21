package com.classesobjects.basic;

public class MethodDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Ram", 3000);
		//employee.name ="Ram";
		//employee.salary = 3000;
		
		employee.getDetails();
		String msg = employee.greetMessage("Hava a great day");
		System.out.println(msg);
		
		
		Employee employee1 = new Employee("Jack", 4000);
		//employee1.name = "Jack";
		//employee1.salary = 4000;
		
		employee1.getDetails();
		//String msg = employee1.greetMessage("Hava a great day");
		employee1.getDetails();
		System.out.println(employee1.greetMessage("Welcome to java"));
	}

}
