package try_catch;

public class TryBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block ...");
			// exception will occur
			System.out.print(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Catch Block ... ");
			System.out.println("Exception Message : " + e.getMessage());
		} finally {
			System.out.println("Finally Block ...");
		}

	}

}
