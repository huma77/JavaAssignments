package com.object.demos;

public class EmpMain {
	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.name);
		System.out.println(employee.salary);
		employee.name="Ram";
		employee.salary=3000;
		
		System.out.println("Employee "+employee.name);
		System.out.println("Employee "+employee.salary);
		
		
		Employee employee1 = new Employee();
		employee1.name="Jack";
		employee1.salary=4000;
		
		System.out.println("Employee 1 "+employee1.name);
		System.out.println("Employee 1 "+employee1.salary);
		
		/*Employee employee2 = employee1;
		System.out.println("Employee 2 "+employee2.name);
		System.out.println("Employee 2 "+employee2.salary);
		
		employee2.salary=5000;
		System.out.println("Employee 2 "+employee2.salary);
		System.out.println("Employee 1 "+employee1.salary);
		
		employee1 = null;
		System.out.println("Employee 2 "+employee2.salary);
		System.out.println("Employee 1 "+employee1.salary);*/
		
		
	}

}
