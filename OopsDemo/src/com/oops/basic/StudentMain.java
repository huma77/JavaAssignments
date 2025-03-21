package com.oops.basic;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentName = "Mary";
		student.studentId = 23;
		student.city = "Madras";
		
		
		student.printDetails();
		
		String result = student.greet("Hello students");
		System.out.println(result);
		
		Student student1 = new Student();
		student1.studentName ="Huma";
		student1.studentId = 34;
		student1.city = "Patna";
		student1.printDetails();
		System.out.println(student1.greet("Hello student1"));
	}
	
	

}
