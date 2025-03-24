package ThrowsKeyword;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// we need to handle exception here.
			abc(a,b);
	}
	
	public static void abc (int a, int b) throws ArithmeticException{
		div(a,b);
	}
	
	public static void div(int a, int b) throws ArithmeticException, NullPointerException{
		System.out.println(a/b);
	}

}
