package Loops;
import java.util.Scanner; 
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.print(0);

		int a =0;
		int b = 1;
		while(num>1) {
			System.out.print(" " + b);
			int temp = a;
			a = b;
			b  = temp + b;
			num--;
		}
	}

}
