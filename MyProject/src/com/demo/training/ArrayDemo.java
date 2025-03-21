package com.demo.training;

public class ArrayDemo {

	public static void main(String[] args) {
		int []numbers = new int[5];
		System.out.println(numbers.length);
		System.out.println(numbers[3]);
		numbers[0] = 12;
		numbers[1] = 14;
		numbers[2] = 15;
		numbers[3] = 17;
		numbers[4] = 18;
		System.out.println(numbers[3]);
		int sum =0;
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			sum = sum+numbers[i];
			
		}
		System.out.println(sum);
			
	}

}
