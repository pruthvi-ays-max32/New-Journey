package com.example.BankChallenge;

class BankAccount {
	private String accountNumber;
	private double balance;
	private String accountHolderName;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void deposite(double amt) {
		if(amt<=0) {
			System.out.println("Invalid Deposite.");
		} 
		else {
			balance += amt;
			System.out.printf("%f Amount Deposited Successfully. %n", amt);
		}
	}
	
	public void withdraw(double amt) {
		if(amt<=0){
			System.out.println("Invalid Withdrawal.");
		}
		else if(amt<=balance) {
			balance -= amt;
			System.out.printf("%n %f Amount Withdraw Successfully.", amt);
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}
}
