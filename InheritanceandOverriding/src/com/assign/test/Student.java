package com.assign.test;

public class Student { // Parent Class
	String[] showCourse() {
		String[] course = { "Java", "PHP", "HTML", "CSS" }; // String Array
		return course;
	}

	double printAvg(int... marks) { // VarArgs
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		double avg = sum / marks.length;
		return avg;
	}

	void greet(String name) { // Param Constructor
		System.out.println("Welcome " + name);
	}
}
