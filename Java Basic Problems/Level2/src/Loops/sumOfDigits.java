package Loops;
import java.util.Scanner;
public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		System.out.println("Sum of digits of given Number is : " + digitSum(number));

	}
	
	public static int digitSum(int num) {	
		int sum = 0;
		
		while(num>0) {
			int x = num%10;
			sum+=x;
			num /=10;
		}
		return sum;
	}

}
