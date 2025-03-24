package try_catch;

public class Return {
	
	public static int add(int a , int b) {
		try {
			System.out.println("Try Block ... ");
			return a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Block ... ");
			return a+b;
		}
		finally {
			System.out.println("Finally Block ... ");
			return a+b;
		}
	}

	public static void main(String[] args) {
		System.out.print(add(2,0));
	}

}

/* finally vs return statement -> 
				finally block has more preference than return statement.
				even if we return from try or catch block then also finally block will be execute.

*/