package com.overloading.demos;

public class ThisDemo {

	
	public static void main(String[] args) {

		/*Mobile mob1 = new Mobile();
		Mobile mob2 = new Mobile("A123");*/
		Mobile mob3 = new Mobile("B234",9000.57);
		System.out.println();
		Mobile mob4 = new Mobile("C456","Samsung",67890);
		
		/*mob1.getDetails();
		mob2.getDetails();*/
		
		mob4.getDetails();		
		System.out.println();
		mob3.getDetails();
		
	}

}
