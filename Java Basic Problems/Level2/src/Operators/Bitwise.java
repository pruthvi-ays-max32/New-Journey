package Operators;
import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a&b;
		System.out.println("Bitwise And "+c);
		
		int d = a|b;
		System.out.println("Bitwise OR " + d);
		
		int e = a^b; // both same 0 otherwise 1
		System.out.println("Bitwise XOR "+ e);
		
		int r = ~a; // int has 4 byte so number of bits are more hence output looks differernt
		System.out.println("Bitwise Not of first" + r);
		
		
		// left shift << shift all bits to left (multiply by times power of 2 )
		int j = a<<1;
		System.out.println("1st number after left shift : " + j);
		
		// Right Shift >> Shift all bits to right (divide by times power of 2)
		int h = a>>1;
		System.out.println("1st Number after right shift : " + h);
	}

}
