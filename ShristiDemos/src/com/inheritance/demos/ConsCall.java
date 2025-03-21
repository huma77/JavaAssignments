package com.inheritance.demos;

class A {
	A() {
		System.out.println("In A");
	}
}

class B extends A {
	B() {
		System.out.println("In B");
	}
}

class C extends A {
	C() {
		System.out.println("In C");
	}
}

public class ConsCall {

	public static void main(String[] args) {
		C ref = new C();
	}

}
