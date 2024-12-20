package Operators;
import java.util.Scanner;
public class Perimeter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 4 sides of rectangle : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("The Perimeter of Rectangle is : " + (a+b+c+d));
	}
}
