package com.overloading.demos;

public class OverloadDemo {

	public static void main(String[] args) {
		Shape shape = new Shape();

		shape.calcArea(10);
		shape.calcArea((int)10.5f);	//typecast
		double area = shape.calcArea(100, 200);
		System.out.println("Rect " + area);
		System.out.println("Tri " + shape.calcArea(12, (int)10.9f));

	}

}
