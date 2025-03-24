package try_catch;

public class EMethods {
	public static void main(String args[]) {
		try {
			int a = 10/0;
			System.out.print(a);
		}catch(Exception e) {
			System.out.println("Catch block ...");
			
			// e.getMessage() -> to get exception message.
			System.out.println(e.getMessage());
			
			// e.toString() -> to exception type and exception message.
			System.out.println(e.toString());
			
			// e.getStackTrace() -> 
			System.out.println(e.getStackTrace());
			
			// it will print error message and location of exception occured and its type.
			e.printStackTrace();
		} finally {
			System.out.print("Finally Block ... ");
		}
	}
}
