package Loops;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		boolean isprimeNo = isprime(num);
		if(num < 2) {
			System.out.println("Neither Prime Nor Composite.");
		}
		else if(isprimeNo) {
			System.out.println("Is Prime Number.");
		}
		else {
			System.out.println("Is Composite Number or Not Prime.");
		} 
	}
	
	public static boolean isprime(int num) {
		int count = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		if(count>0) return false;
		
		return true;
	}
}
