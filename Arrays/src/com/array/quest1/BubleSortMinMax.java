package com.array.quest1;

import java.util.Scanner;

public class BubleSortMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input Array size
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		// Populating Array
		System.out.println("Enter " + n + " elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		// Bubble Sort Algorithm - Ascending order
		for(int i=0;i<(n-1); i++) {
			for(int j=0;j<(n-i-1); j++) {
				if (arr[j]>arr[j+1]) {
					// Swap elements
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
				
		}
		// Smallest element is at index 0, Largest is at last index
		System.out.println("Smallest Element: " + arr[0]);
		System.out.println("Largest Element: "+ arr[n-1]);
		sc.close();
	}
}
