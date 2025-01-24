package in.abstraction;

public class Car extends Vehicle{

	Car(int noOfTyers){
		super(noOfTyers);
	}
	
	public void sound() {
		System.out.println("Vroooooom .....");
	}
}
