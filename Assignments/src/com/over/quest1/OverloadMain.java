package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Create an Array
		Employee[] employees = new Employee[5];
		
		//Iterate and pass values for name and designation
		for(int i=0; i<employees.length; i++) {
			
		// Get user input
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter designation as Programmer/Manager/Director ");
		String designation = sc.nextLine();
		
		// Add the objects to an employee array
		employees[i] = new Employee(name, designation);
		}
		
		// Based on the designation call the appropriate calcBonus method 
		System.out.println("===== Employee Details =====");
        for (Employee emp : employees) {
        	System.out.println("Name: "+ emp.name);
        	System.out.println("Designation: "+ emp.designation);
        	
        	if (emp.designation.equals("Programmer")) {
        		emp.calcBonus(2000);
        		System.out.println();
        	}
        	if (emp.designation.equals("Manager")) {
        		emp.calcBonus(20000,"Laptop");
        		System.out.println();
        	}
        	if (emp.designation.equals("Director")) {
        		emp.calcBonus(20000, "Car", 3000);
        		System.out.println();
        	}
        }
        sc.close();	
	}
	
}
