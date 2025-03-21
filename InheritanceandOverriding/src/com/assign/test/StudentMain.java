package com.assign.test;

public class StudentMain {

	public static void main(String[] args) {
		OnlineStudent student = new OnlineStudent();
		// Calling methods in Main class
		String[] courses = student.showCourse();		// Method 1
		for (String course : courses) {
			System.out.println(course);
		}
		double avg = student.printAvg(56, 87, 98, 90); 	// Method 2
		System.out.println(avg);

		student.greet("Huma"); 							// Method 3
		String[] hobbies = student.printHobbies(); 		// Method 4
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}
	}

}
