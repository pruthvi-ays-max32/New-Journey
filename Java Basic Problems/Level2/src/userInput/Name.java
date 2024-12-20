package userInput;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		System.out.println("Enter Your Name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Welcome "+ name + " to KG Coding");
	}

}
