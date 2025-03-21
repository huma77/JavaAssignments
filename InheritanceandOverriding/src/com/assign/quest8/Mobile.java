package com.assign.quest8;

public class Mobile extends Electronics {
	double batterylife;

	public Mobile(String brand, double price, double battery) {
		super(brand, price);
		this.batterylife = battery;
	} 
}
