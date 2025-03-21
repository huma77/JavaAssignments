package com.oops.quest5;

public class Mobile {
	// Properties
    String model, brand;
    int price;

    // Parameterized constructor
    public Mobile(String model, String brand, int price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    // Method to display mobile details
    public void getDetails() {
        System.out.println("Model: " + model + ", Brand: " + brand + ", Price: $" + price);
    }
}
