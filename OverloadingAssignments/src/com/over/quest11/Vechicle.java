package com.over.quest11;

public class Vechicle {
	String brand;
	String model;
	double year;
//Param constructor
	public Vechicle(String brand, String model, double year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
public Vechicle(String brand, String model) {
	super();
	this.brand = brand;
	this.model = model;
}
	void printDetails() {
		System.out.println("Brand "+ brand);
		System.out.println("Model "+ model);
		if(year>0) {
			System.out.println("year "+ year);
		}
		
	}
	
	
}
