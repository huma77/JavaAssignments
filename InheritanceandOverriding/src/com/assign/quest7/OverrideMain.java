package com.assign.quest7;

public class OverrideMain {

	public static void main(String[] args) {
		Company company = new Company("Infosys");
		company.getDetails();
		company = new ITCompany("Apple", 10, "Linux");
		company.getDetails();
		ITCompany itCompany = (ITCompany)company; 
		String tech = itCompany.showProjects("Java");
		System.out.println(tech);
	}

}
