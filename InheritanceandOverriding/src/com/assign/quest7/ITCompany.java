package com.assign.quest7;

public class ITCompany extends Company {
	int numOfDevelopers;  
	String techStack;
	public ITCompany(String companyName, int numOfDevelopers, String techStack) {
		super(companyName);
		this.numOfDevelopers = numOfDevelopers;
		this.techStack = techStack;
	}
	@Override
	void getDetails() {
		super.getDetails();
		System.out.println("No of developers: "+numOfDevelopers);
		System.out.println("Tech Stacks: " + techStack);
	}
	String showProjects(String type) {
		
		return "Mobile Applications: " + type;
		
	}
	
}
