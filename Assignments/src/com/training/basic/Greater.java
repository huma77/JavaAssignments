package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int num[] = {12,5,8,0,5,43};
		int max = num[0];
		for(int i=0; i<num.length; i++) {
			if (num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("Greater value in array is: "+max);
 	}

}
