package Operators;
import java.util.Scanner;
public class EvenOddUsingBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int x = sc.nextInt();
		
		// to make rightmost bit 1 or 0.
		int rightmostbit = x & 1;
		
		if(rightmostbit == 1 ) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
	}

}
