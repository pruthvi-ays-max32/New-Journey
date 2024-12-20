package Patterns;
import java.util.Scanner;
public class leftPattern {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Pattern 1 :");
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
