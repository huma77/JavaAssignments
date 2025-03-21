package com.assign.test5;

public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	void deposit(double amount){
		balance = balance + amount;
	}
	void withdraw(double amount){
		balance = balance - amount;
	}
}
