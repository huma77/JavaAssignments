package com.assign.quest8;

public class Laptop extends Electronics {
	int ramSize;

	public Laptop(String brand, double price, int ramSize) {
		super(brand, price);
		this.ramSize = ramSize;
	}

}
