package Operators;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int b = sc.nextInt();
		
		System.out.println("The sum of given two numbers is : " + (a+b));
		System.out.println("The difference of given two numbers is : " + (a-b));
		System.out.println("The Multiplication of given two numbers is : " + (a*b));
		System.out.println("The Division of given two numbers is : " + (a/b));
		System.out.println("The Module of given two numbers is : " + (a%b));
		
		
		System.out.print("Enter the first float number : ");
		float c = sc.nextFloat();
		
		System.out.print("Enter the Second float number : ");
		float d = sc.nextFloat();
		
		System.out.println("The product of two float numbers is : " + (c*d));
		
	}

}
