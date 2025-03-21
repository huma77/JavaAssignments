package com.oops.basic;

public class ConDemo {

	public static void main(String[] args) {
		Student student = new Student("Priya", 1, "Ban");
		student.printDetails();
		String result = student.greet("Hello");
		System.out.println(result);
}

}
