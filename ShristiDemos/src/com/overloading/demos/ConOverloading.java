package com.overloading.demos;

public class ConOverloading {

	public static void main(String[] args) {

		Student stud1 = new Student();
		Student stud2 = new Student("Ram",1);
		Student stud3 = new Student("Tom","Bangalore",2);

		stud1.getDetails();
		stud2.getDetails();
		stud3.getDetails();
	}

}
