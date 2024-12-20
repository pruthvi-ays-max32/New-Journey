package conditions;
import java.util.Scanner;
public class greaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Numbers : ");
		int fno = sc.nextInt();
		int sno = sc.nextInt();
		int tno = sc.nextInt();
		
//		if(fno>sno && sno>tno) System.out.println("First Number is Greater.");
//		if(sno>fno && sno>tno) System.out.println("Second Number is Greater");
//		if(tno > fno && tno > sno) System.out.println("Third Number is Greater");
		
		
		if(fno>sno && fno>tno) System.out.println("First Number is Greater");
		else if(sno > tno) System.out.print("Second Number is Greater");
		else System.out.println("Third is greater");
	}
}
