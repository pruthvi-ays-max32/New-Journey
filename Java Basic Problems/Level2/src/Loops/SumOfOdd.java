package Loops;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			if(i%2!=0) {
				sum += i;
			}
		}		
		System.out.println("Sum of all odd numbers till digit " + num + " is " + sum);
	}
}
