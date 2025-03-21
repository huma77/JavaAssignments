package com.over.quest4;

public class Greeter {
	String name;
	
	// default const,  
	Greeter(){
		
	}
	
	//parameterized const
	Greeter(String name){
		this.name = name;
	}
	
	//String Array{"Hello", "Welcome", "Goodbye"}
	void greetUser(String...messages) {
		for(String msg:messages) {
			System.out.println(msg + " " + name);
			
		}
		
	}
	void sayHello(String...names) {
		for(String name:names) {
			System.out.println("Welcome " + name);
		}
	}
}
