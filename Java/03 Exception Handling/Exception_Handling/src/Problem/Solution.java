package Problem;

/*
 			Arithmetic Exception Handling
	Write a program that asks the user to enter two integers and then divides the first by the second. The program should handle any arithmetic exceptions that may occur (like division by zero) and display an appropriate message.
	Key Points:
	• Use Scanner to read user input.
	• Implement a try-catch block to handle ArithmeticException.
	• Display a user-friendly message if division by zero occurs.
 */

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int div = a/b;
			System.out.println(div);
		} catch(ArithmeticException e) {
			System.out.printf("%s, Enter valid values.", e.getMessage());
		}
		

	}

}
