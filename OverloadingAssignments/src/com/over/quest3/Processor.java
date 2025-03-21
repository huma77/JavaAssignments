package com.over.quest3;

public class Processor {
	
	void calculate(double x) {
		int squareRoot = (int)Math.sqrt(x);
		System.out.println(squareRoot);
	}
	
	void calculate (int x, int y) {
		int product = x * y;
		System.out.println("Product: "+ product);
	}
	
	void calculate (double x, double y) {
		double difference = x - y;
		System.out.println("Difference: "+ difference);
	}
	
	void calculate (double x, int y) {
		double power = Math.pow(x, y);
		System.out.println("Power: "+ power);
	}
	
	void calculate (int x) {
		double square = Math.pow(x, 2);
		System.out.println("square: "+ square);
	}

}