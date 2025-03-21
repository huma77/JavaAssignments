package com.inher.quest1;

public class TeamTwo extends Project{
	// override doTask - "Project implemented using Python" 
	
	void doTask() {
		System.out.println("Project implemented using Python");
	}
	String[] getTechStack(){
		String[] tech = {"Java","Spring","Angular"};
		return tech;
	}
}
