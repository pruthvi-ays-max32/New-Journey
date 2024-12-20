package Loops;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		System.out.println("The Original Number : " + num);
		int reversedNumber = reverse(num);
		System.out.println("The Reverse Number : " + reversedNumber);
	}

	public static int reverse(int num) {
		
		int rev = 0;
		while(num>0) {
			int x = num%10;
			rev = rev*10 + x;
			num/=10;
		}

		return rev;
	}
}
