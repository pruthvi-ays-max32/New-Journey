package Operators;
import java.util.Scanner;
public class Simple_Interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal, Time and Rate of interest respectively : ");
		float P = sc.nextFloat();
		int T = sc.nextInt();
		float R = sc.nextFloat();
		
		System.out.println("Simple interest is : " + (P*T*R)/100);
		
		System.out.println("Compound interest is : " + P*(1+R/100)*T);
	}

}
