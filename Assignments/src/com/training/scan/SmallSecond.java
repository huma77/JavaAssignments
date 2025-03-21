package com.training.scan;

import java.util.Scanner;
import java.util.Arrays;

public class SmallSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Get array size
		System.out.println("Enter the number of elements: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + "element: ");
		// Read Array elements
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		//Find Second smallest element
		if (size < 2) {
			System.out.println("Array must have at least 2 elements. ");
		}else {
			Arrays.sort(arr);
			System.out.println("The second smallest element is: " +arr[1] );
		}
	}

}
