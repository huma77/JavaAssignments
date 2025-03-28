package com.inher.quest1;

public class CompanyMain {
	/*
	 * Project project = new TeamOne(); call the method of TeamOne Also call the own
	 * method of TeamOne Follow the same process for TeamTwo }
	 */

	public static void main(String[] args) {
		Project project = new TeamOne(); // Override
		project.doTask();
		TeamOne teamOne = (TeamOne) project; // downcast // Creating a reference
		teamOne.softwaresUsed("Jenkins", "Java", "CSS");
		project = new TeamTwo();
		project.doTask();

		TeamTwo t2 = (TeamTwo) project;
		String[] tech = t2.getTechStack();
		for (String t : tech) {
			System.out.println("Tech :" + t);
		}

	}
}
