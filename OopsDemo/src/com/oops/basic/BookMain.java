package com.oops.basic;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("Man and Van", "Kem", 550);
		book.getDetails();
		
		String result =  book.checkType();
		System.out.println(result);
		
	}
	

}
