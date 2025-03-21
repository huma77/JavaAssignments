package com.controlflow.demos;

public class WhileDemo {

	public static void main(String[] args) {
		int x=1;
		while(x>10){
			System.out.println(x);
			x++;
		}
		int y=100;
		do{
			System.out.println(y);
			y++;
		}while(y>110);
	}
}