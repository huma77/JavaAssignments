package com.controlflow.demos;

public class IfDemo {
	public static void main(String[] args) {
		int x=100,y=120,z=130;
		if(x>y && x>z){
			System.out.println("X is greater");
		}else if(y>z){
			System.out.println("Y is greater");
		}else{
			System.out.println("Z is greater");
		}
		
	}

}
