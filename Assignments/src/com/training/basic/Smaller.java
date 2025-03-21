package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int num[] = {7,9,10,1,5,43};
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Minimun number in the array is: "+min);
	}

}
