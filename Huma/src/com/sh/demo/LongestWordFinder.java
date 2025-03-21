package com.sh.demo;


	import java.util.Scanner;

	public class LongestWordFinder {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get sentence from user
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Split the sentence into words
	        String[] words = sentence.split("\\s+");

	        String longestWord = "";
	        int maxLength = 0;

	        // Iterate through words to find the longest one
	        for (String word : words) {
	            if (word.length() > maxLength) {
	                maxLength = word.length();
	                longestWord = word;
	            }
	        }

	        // Output: Display the longest word
	        System.out.println("Longest word: " + longestWord);
	        System.out.println("Length: " + maxLength);

	        scanner.close();
	    }
	}


