package com.jamesshore.finances;

public class SavingsAccountYear {

	private int startingBalance = 0;
	private int interestRate;
	
	public SavingsAccountYear(int startingBalance, int interestRate) {
		this.startingBalance = startingBalance;
		this.interestRate = interestRate;
		
		
	}

	public SavingsAccountYear() {
		// TODO Auto-generated constructor stub
	}

	public int startingBalance() {
		
		return startingBalance;
	}
	
	
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		startingBalance += amount;
		
	}

	public int balance() {
		// TODO Auto-generated method stub
		return startingBalance;
	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		startingBalance -= amount;
		
	}

	public SavingsAccountYear nextYear() {
		return new SavingsAccountYear(this.endingBalance(),interestRate);
	}

	public int endingBalance() {
		return balance() + (balance()*interestRate/100);
	}

	public int interestRate() {
		
		return interestRate;
	}


}
