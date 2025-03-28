package com.oops.quest4;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Training training = new Training();
		// Get trainers name as input
		System.out.println("Enter number of trainers: ");
		int numTrainers = sc.nextInt();
		sc.nextLine();
		
		String[] trainerNames = new String[numTrainers];
		
		for (int i=0; i< numTrainers; i++) {
			System.out.println("Enter trainer " + (i+1) + " names: ");
			trainerNames[i] = sc.nextLine();
		}
		
		// Call method to display trainer names
		training.showTrainers(trainerNames);
		
		// Call method to get course names
		System.out.println("Courses availability: ");
		String[] courses = training.showCourses();
		for (String course : courses) {
			System.out.println("* " + course);
		}
		sc.close();
	}

}
