package com.controlflow.demos;

public class Typecastingdemo {

	public static void main(String[] args) {

		int x=10,y=20;
		//upcasting
		long a =x+y;
		System.out.println(a);
		//downcasting
		int p=(int)a;
		
		float v= (float)12.4;
		System.out.println("Sum "+a+p+v);//concat
		System.out.println("Sum "+(a+p+v));
		
		//local variable should be initialised before using
		int s=100,z=200;
		System.out.println(s+z);
		
	}

}
