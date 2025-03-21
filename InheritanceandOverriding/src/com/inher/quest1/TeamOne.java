package com.inher.quest1;

public class TeamOne extends Project {

	// override doTask - "Project implemented using Java"
	@Override
	void doTask() {
		System.out.println("Project implemented using Java");
	}

	// create own method as void
	// VarArgs (String...tools)
	void softwaresUsed(String... tools) {	//datatype varArgs	
		// Iterate through the tools and print it(eclipse. Jenkins, maven)
		for (String tool : tools) {
			System.out.println("Tools" + tool);
		}
	}

}
