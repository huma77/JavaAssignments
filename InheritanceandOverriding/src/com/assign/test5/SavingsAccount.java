package com.assign.test5;

public class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
}
