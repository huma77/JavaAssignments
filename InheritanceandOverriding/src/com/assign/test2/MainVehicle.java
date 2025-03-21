package com.assign.test2;

public class MainVehicle {

	public static void main(String[] args) {
		// creating objects
		Car car = new Car("Minicooper", 220, 3); 
		Bike bike = new Bike("Honda", 70, false);
		//Display Details
		System.out.println("Car details:");
		car.displayDetails();
		System.out.println("Bike details:");
		bike.displayDetails();
	}

}
