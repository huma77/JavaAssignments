package com.demo.training;

public class Main {

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.doctorName = "Mary";
		doctor.doctorFees = 500.00;
		System.out.println("doctor " + doctor.doctorName);
		System.out.println("doctor " + doctor.doctorFees);
		
		doctor.printDetails();
		String result = doctor.greet();
		System.out.println(result);

		Doctor doctor1 = new Doctor();
		doctor1.doctorName = "Sumit";
		doctor1.doctorFees = 200.00;
		System.out.println(doctor1.doctorName);
		System.out.println(doctor1.doctorFees);
		doctor1.printDetails();
		System.out.println(doctor1.greet());
		
		
	}

}
