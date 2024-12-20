package com.example.BankChallenge;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		BankAccount Kunal = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to SBI.");
		System.out.println("Please Enter Account Holder Name for Creating Account.");
		String name = sc.next();
		Kunal.setAccountHolderName(name);

		System.out.println("Please Enter Account Number.");
		String accNo = sc.next();
		Kunal.setAccountNumber(accNo);
		
		System.out.println("Please Enter Balance.");
		double bal = sc.nextDouble();
		Kunal.setBalance(bal);
		System.out.println("Before : " + Kunal.getBalance());
		Kunal.deposite(3000);
		System.out.println("After : " + Kunal.getBalance());
		
		System.out.printf("Account Holder name : %s %nAccount Number : %s %nBalance : %f", Kunal.getAccountHolderName(), Kunal.getAccountNumber()
				, Kunal.getBalance());
		
		Kunal.withdraw(3000);
		System.out.println("\nRemaining Balance : " + Kunal.getBalance());
		
		
		// Checking all possibilities.
		Kunal.withdraw(0);
		Kunal.withdraw(-70);
		Kunal.deposite(-50);
		Kunal.deposite(0);
		Kunal.deposite(100);
		Kunal.withdraw(100);
	}

}
