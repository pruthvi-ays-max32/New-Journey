package Operators;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit : ");
		float fahrenheit = sc.nextFloat();
		
		float celcius = (fahrenheit - 32)*5/9;
		System.out.println("The Temperature in Celcius : " + celcius);

	}

}
