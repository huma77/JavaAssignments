package com.arrayprograms.demos;
import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println(age);
		//sc.nextLine(); // flushing the line
		System.out.println("Enter Department");
		String dept = sc.nextLine();
		System.out.println(dept);
		
		System.out.println("Enter salary");
		float sal = sc.nextFloat();
		System.out.println(sal);
		
		System.out.println("Enter Bonus");
		double bonus = sc.nextDouble();
		System.out.println(bonus);
		
		sc.close();
		
	}

}
