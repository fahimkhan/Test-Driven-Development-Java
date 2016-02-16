package com.jamesshore.finances;

public class SavingsAccount {

	private int balance = 0;
	
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		
	}

	public int balance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		balance -= amount;
		
	}

}
