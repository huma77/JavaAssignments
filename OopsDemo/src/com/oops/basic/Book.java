package com.oops.basic;

public class Book {
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	};

	void getDetails() {
		System.out.println(title + author + price);
	}

	String checkType() {

		if (price > 500) {
			return "Primium Book";
		} else {
			return "Standard Book";
		}
	}

}
