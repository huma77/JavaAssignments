package com.oops.quest4;

public class Training {
	public String[] showCourses() {
		return new String[] {"IT","Maths", "Coding","Science"};
	}
	
	void showTrainers(String...names) {
		System.out.println("Trainer details: ");
		for (String name : names) {
			System.out.println("* " + name);
		}
	}
	
}
