package in.abstraction;

public interface Transport {
	
	// by default public and abstract.
	void getSetGo();
	
	// we can declare static / default methods.
	// it doesn't allow normal methods because we can't create object of it.
	
	public static int noOfMaxPassengers() {
		return 50;
	}
	
	public default void run() {
		System.out.println("Hello");
	}
	
}
