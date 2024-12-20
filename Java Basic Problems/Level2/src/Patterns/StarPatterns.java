package Patterns;
import java.util.Scanner;
public class StarPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows In Star Pattern : ");
		int num = sc.nextInt();
		pattern1(num);
		pattern2(num);
		pattern3(num);
		pattern4(num);
		pattern5(num);
	}
	
	
	// 4*4
	public static void pattern1(int num) {
			System.out.println("Pattern 1 :");
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	
	// 1 to 4
	public static void pattern2(int num) {
		System.out.println("Pattern 2 :");
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 4 to 1
	public static void pattern3(int num) {
		System.out.println("Pattern 3 :");
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	// Diagonal Pattern
	public static void pattern4(int num) {
		System.out.println("Pattern 4 :");
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++ ) {
				if(i==j) System.out.print("*");
				else System.out.print("  ");
			}	
			System.out.println();
		}
	}
	
	
	public static void pattern5(int num) {
		System.out.println("Pattern 5 :");
		
	}
}
