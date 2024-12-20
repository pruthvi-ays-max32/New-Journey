package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = sc.nextInt();
		int fact = 1;
		
		if(num == 0 || num == 1) System.out.println("Factorial is 1");
		else {
			for(int i=2; i<=num; i++) {
				fact *= i;
			}
			System.out.println(fact);
		}
	}

}
