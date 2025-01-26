package in.abstraction;

public class Car extends Vehicle{

	Car(int noOfTyers){
		super(noOfTyers);
	}
	
	public void sound() {
		System.out.println("Vroooooom .....");
	}

	// implementation of abstract method present in Interface.
	@Override
	public void getSetGo() {
		System.out.println("Here we come ... ");	
	}
}
