package com.assign.test2;

public class Vehicle {
	String brand;
	int speed;
	
	public Vehicle(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}
	void displayDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed + "km/h");
	}
}
