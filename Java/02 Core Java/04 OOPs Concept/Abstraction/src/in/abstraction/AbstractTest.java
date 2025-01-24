package in.abstraction;

public class AbstractTest {

	public static void main(String[] args) {
		
		/*
		Vehicle vh = new Vehicle(6);
				
		-> It will give the error because Vehicle is an abstract class we can't create object of it.
		-> we can access its properties by creating object of child class.
		*/
		
		Car cr = new Car(6);
		cr.start();
		cr.stop();
		System.out.println(cr.getNoOfTyers());
		cr.sound();

	}
}
