package com.demo.training;

public class SwitchDemo {

	public static void main(String[] args) {
		int x =10, y=200;
		switch (x+y) {
			case 30: 
				System.out.println("Sum" + (x+y));
				//break;
			case 50:
				System.out.println((x+y));
				//break;
			case 80:
				System.out.println((x+y));
				break;
			default:
				System.out.println(x+y);
		}	
		String day = "Monday";
		switch (day.toUpperCase()) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("Working day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Weekend");
		default:
			System.out.println("Not a day");
			break;
		}
	}
}


