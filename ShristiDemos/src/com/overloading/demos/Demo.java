package com.overloading.demos;

public class Demo {

	public Demo() {
		System.out.println("Hello");
	}
	public Demo(int x) {
		this("Ram");
		System.out.println("Value " + x);

	}
	public Demo(String s) {
		//this();
		System.out.println("welcome " + s);
	}
	public static void main(String[] args) {

		Demo d1 = new Demo(10);
	}

}
