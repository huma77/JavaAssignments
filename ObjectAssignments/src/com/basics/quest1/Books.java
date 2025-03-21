package com.basics.quest1;

public class Books {
	String title;
	String author;
	double price;
	String category;
	
	Books(String title, String author, double price, String category){
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println(title + author + price + category);
	}
	
	String checkBookType() {
		if (price > 500) {
			return "Premium Book";
		} else {
			return "Standard Book";
		}
		
	}
	
}