package com.training.basic;

public class Factorial {

	public static void main(String[] args) {
		int[] tableOfTwo = new int[10];
				
		for(int x=0; x<10; x++) {
			tableOfTwo[x] = 2 * (x+1); 
			System.out.println("Table of 2 = "+ tableOfTwo[x]);
		}
	}

}
