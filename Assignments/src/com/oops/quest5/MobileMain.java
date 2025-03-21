package com.oops.quest5;

public class MobileMain {

	public static void main(String[] args) {
		// Creating Mobile objects
        Mobile mobile1 = new Mobile("Galaxy S21", "Samsung", 29000);
        Mobile mobile2 = new Mobile("iPhone 13", "Apple", 70000);
        Mobile mobile3 = new Mobile("Redmi Note 10", "Xiaomi", 15000);
        Mobile mobile4 = new Mobile("Galaxy A52", "Samsung", 25000);
        Mobile mobile5 = new Mobile("OnePlus 9", "OnePlus", 50000);

        // Storing mobiles in an array
        Mobile[] mobileArray = new Mobile[5];
        mobileArray[0] = mobile1;
        mobileArray[1] = mobile2;
        mobileArray[2] = mobile3;
        mobileArray[3] = mobile4;
        mobileArray[4] = mobile5;

        // Printing all mobile details
        System.out.println("All Mobile Details:");
        for (Mobile mobile : mobileArray) {
            mobile.getDetails();
        }

        // Printing only Samsung mobiles
        System.out.println("\nSamsung Mobiles:");
        for (Mobile mobile : mobileArray) {
            if (mobile.brand.equalsIgnoreCase("Samsung")) {
                mobile.getDetails();
            }
        }
    }
	

}
