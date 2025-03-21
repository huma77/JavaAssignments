package com.over.quest9;

public class Movie {
	String name;
	String genre;
	int rating;
	public Movie(String name, String genre, int rating) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
	}
	
	void movieDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Gengre : "+ genre);
		System.out.println("Rating: "+rating);
	}
		
	
}
