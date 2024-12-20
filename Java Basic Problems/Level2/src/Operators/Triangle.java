package Operators;
import java.util.Scanner;
public class Triangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Base and Height of triangle : ");
		
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		
		System.out.println("Area of given Triangle is : " + (1.0/2.0)*(base*height));
	}
}
