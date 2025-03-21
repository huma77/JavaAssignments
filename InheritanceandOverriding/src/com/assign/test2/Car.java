package com.assign.test2;

public class Car extends Vehicle {
	int numDoors;

	public Car(String brand, int speed, int numDoors) {
		super(brand, speed);
		this.numDoors = numDoors;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Number of doors: " + numDoors);
	}
}
