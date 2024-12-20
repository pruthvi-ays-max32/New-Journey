package conditions;
import java.util.Scanner;
public class AgeGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Person : ");
		int age = sc.nextInt();
		
		if(age>60) System.out.print("Senior");
		else if(age<=60) { 
			System.out.println("Adult");
			if(age<13) System.out.println("Child");
			else if(age<20)System.out.println("Teen");
		}

	}

}
