package conditions;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage of Student out of 100 : ");
		float percentage = sc.nextFloat();
		
		if(percentage>=90.0) {
			System.out.println("The grade of given student is A");
		}
		else if (percentage>=75.0) {
			System.out.println("The grade of given student is B");
		}
		else if (percentage>=60.0)System.out.println("The grade of Given Student is C");
		
		else if (percentage>=30) System.out.println("The grade of Given Student is D");
		
		else System.out.println("The grade of student is F");

	}

}
