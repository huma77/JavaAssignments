package com.oops.quest2;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("Huma", "it");
		
		student.printDetails();
		
		String grade =student.getGrades(78, 46, 67);
		System.out.println(grade);
		
		String msg = student.sayHello("Hello");
		System.out.println(msg);
		
		double val = student.checkNumber(78);
		System.out.println(val);
		
		System.out.println("Hello ");
		
	}

}
