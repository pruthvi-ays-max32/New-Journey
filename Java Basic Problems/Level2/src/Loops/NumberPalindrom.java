package Loops;
import java.util.Scanner;
public class NumberPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int rev = ispalindrom(num);
		if(num == rev) {
			System.out.print("Number is palindrom");
		}
		else {
			System.out.println("Number is not palindrom");
		}
		

	}
	
	public static int ispalindrom(int num) {	
		int rev = 0;
		
		while(num>0) {
			int x = num%10;
			rev = rev*10 + x;
			num/=10;
		}
		return rev;
	}
}
