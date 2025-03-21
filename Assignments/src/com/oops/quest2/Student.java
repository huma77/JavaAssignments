package com.oops.quest2;

public class Student {
	String name;
	String department;
	
	Student(String name, String department){
		this.name = name;
		this.department = department;
	}
	void printDetails() {
		System.out.println("Name" + name);
		System.out.println("Department " + department);
	}
	String getGrades(int mark1, int mark2, int mark3) {
		int sum = mark1 + mark2 +mark3;
		double avg = sum/3;
		
		if(avg>90) {
			return "GradeA";
		}
		else if(avg>80 & avg<90) {
			return "Grade B";
		}
		else if(avg>70 & avg<80) {
			return "Grade C";
		}
		else if(avg>60 & avg<70) {
			return "Grade D ";
		}
		else 
			return "fail";
	}
	
	String sayHello(String message) {
		return message + name;
	}
	
	double checkNumber(int x) {
		
		if(x > 100) {
			return x*x;
		} else {
			return x;
		}
	}
	
}
