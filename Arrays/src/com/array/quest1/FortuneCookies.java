package com.array.quest1;

import java.util.Random;

public class FortuneCookies {
	static String[] fortunes = {
	"You will meet a stranger who will become a friend",
	"You will receive timely advice from a wise person",
	"You will find love from a past meeting",
	"A problem will solve itself",
	"A new friendship will bring joy",
	"You will have good luck today",
	"You will have a fun adventure",
	"You will make a best friend",
	"Someone will make you smile today",
	"Someone new will come into your life soon"
	};
	public static void main(String[] args) {
		Random rand = new Random();
		rand.nextInt();
		System.out.println(fortunes[0]);
	}

}
