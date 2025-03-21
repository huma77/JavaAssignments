package com.overloading.demos;

public class VarArgsDemo {

	void calcSum(String name, int... marks){
		System.out.println("Name "+name);
		System.out.println("Number of subjects "+marks.length);
		int sum = 0;
		for (int i : marks) {
			sum+=i;
		}
		System.out.println("Sum "+sum);
	}
	void calcSum(String name){
		System.out.println("welcome "+name);
	}
	
	public static void main(String[] args) {
		VarArgsDemo vargs = new VarArgsDemo();
		vargs.calcSum("Ram");
		vargs.calcSum("Tom",80);
		vargs.calcSum("John",80,90);
		vargs.calcSum("Kathy", 80,90,100);
		
	}

}
