package com.oops.quest2;

public class Bank {
	double balance;
	Bank(double balance){
		this.balance = balance;
	}
	
	void withdraw(double amount){
		balance = balance-amount;
	}
	void deposit(double amount) {
		balance = balance+amount;
	}
	double getBalance(){
		return balance;
	}
}

