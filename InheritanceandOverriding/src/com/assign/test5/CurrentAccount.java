package com.assign.test5;

public class CurrentAccount extends BankAccount{
	double overdraftLimit;

	public CurrentAccount(double balance, double overdraftLimit) {
		super(balance);
		this.overdraftLimit = overdraftLimit;
	}
}
