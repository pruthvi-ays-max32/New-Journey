package Enums;

/*
 		Q1 : Create an enum called Day that represents the days of the week. 
 		Write a program that prints out all the days of the week from this enum.
 		
		Q2: Enhance the Day enum by adding an attribute that indicates whether 
		it is a weekday or weekend. Add a method in the enum that returns whether 
		it's a weekday or weekend, and write a program to print out each day along with its type.
 */

public class PrintDays {

	public static void main(String[] args) {
		for (Days day : Days.values()) {
			System.out.println(day + " " + day.getType());
			
		}
	}

}
