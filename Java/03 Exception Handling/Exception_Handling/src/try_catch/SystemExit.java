package try_catch;

public class SystemExit {

	public static int add (int a , int b) {
		try {
			System.out.println("Try Block ... ");
//			System.exit(0);
			return a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Block ... ");
			System.exit(a);
		}
		finally {
			System.out.println("Finally Block ... ");
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(add(1,0));

	}
}

/* 
 	Finally vs System.exit(); -> 
 		System.exit() has more priority than finally block.
 		System.exit() -> it will stop the JVM from Working so program will be terminated.
 */