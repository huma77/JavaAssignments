package com.over.quest4;

public class GreeterMain {
	public static void main(String[] args) {
		Greeter greeter = new Greeter("Huma");// param const
		greeter.greetUser("Hello", "Welcome", "Goodbye");
		Greeter greeter2 = new Greeter(); //default const
		greeter2.sayHello("Huma","Rohit","Sam");
		
		
	}
}
