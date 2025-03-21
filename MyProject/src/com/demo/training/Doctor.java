package com.demo.training;

public class Doctor {

	String doctorName;
	double doctorFees;

	void printDetails() {
		System.out.println("name " + doctorName);
		System.out.println("fees " + doctorFees);
	}
	String greet(){
		return "Hello  "+ doctorName;
	}
}
