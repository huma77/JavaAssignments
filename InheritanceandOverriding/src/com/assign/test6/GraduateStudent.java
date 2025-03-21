package com.assign.test6;

public class GraduateStudent extends Student {
	String researchTopic;
	String advisorName;
	public GraduateStudent(String name, int id, String course, String researchTopic, String advisorName) {
		super(name, id, course);
		this.researchTopic = researchTopic;
		this.advisorName = advisorName;
	}
	void printDetails() {
		super.printDetails();
		System.out.println("Research Topic: "+researchTopic);
		System.out.println("Advisor Name: "+advisorName);
	}
	
}
