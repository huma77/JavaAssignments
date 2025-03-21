package com.oops.quest2;

public class StudMain {

	public static void main(String[] args) {
		Student student = new Student("Bina", "Medicine");
		student.printDetails();
		
		String grade = student.getGrades(78, 34, 56);
		System.out.println(grade);
		
		String s = student.sayHello("Welcome");
		System.out.println(s);
		
		double val = student.checkNumber(120);
		System.out.println(val);
	}
}
