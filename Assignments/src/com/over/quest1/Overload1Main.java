
		/*
		 * Get user input for employee name and designation as Manager, 
		programmer, Director.  
		∙Create 5 employee objects. Add the objects to an employee array 
		∙Based on the designation call the appropriate calcBonus method 
		∙If the input for designation is Programmer call method with one 
		argument(basicAllowance) 
		∙If the input for designation is Manager, call method with 2 
		arguments(basicAllowance,gift) 
		∙If the input for designation is Director call method with 3 
		argumemts(basicAllowance,gift,housingAllowance) 
		*/
package com.over.quest1;

import java.util.Scanner;

public class Overload1Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);		//user input
		 // Create an employee array of 5 objects
		 Employee[] employees = new Employee[5];
		 // iterate and pass values for name and designation 
		 for(int i=0; i<employees.length; i++) {
			 // Get user input
			 System.out.println("Enter your name: ");
			 String name  = sc.nextLine();
			 System.out.println("Enter designation as Programmer/Manager/Director: ");
			 String designation = sc.nextLine();
			 // populating/ adding objects to the array with name and designation
			 employees[i] = new Employee(name, designation);
		 }
		 // Based on the designation call the appropriate calcBonus method
		 for(Employee emp : employees) {
			 System.out.println("Name " + emp.name);
			 System.out.println("designation " + emp.designation);
		  //If the input for designation is Programmer call method with one argument(basicAllowance)
			 if(emp.designation.equals("Programmer")) {
				 emp.calcBonus(2000);
			 }
		 //If the input for designation is Manager, call method with 2 arguments(basicAllowance,gift)
			 if(emp.designation.equals("Manager")) {
				 emp.calcBonus(20000, "Laptop");
			 }
		//If the input for designation is Director, call method with 3 argumemts(basicAllowance,gift,housingAllowance)
			if(emp.designation.equals("Director")) {
				emp.calcBonus(20000, "Car", 3000);
			}
		 }
		 sc.close();
	}

}
