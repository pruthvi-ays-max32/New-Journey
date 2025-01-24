package in.abstraction;

public abstract class Vehicle {
	
	private int noOfTyers;

	// Constructor
	public Vehicle(int noOfTyers) {
		this.noOfTyers = noOfTyers;
	}
	
	// Getter and Setter 
	public int getNoOfTyers() {
		return noOfTyers;
	}

	public void setNoOfTyers(int noOfTyers) {
		this.noOfTyers = noOfTyers;
	}
	
	// abstract Method.
	public abstract void sound();
	
	// Some Methods
	public void start () {
		System.out.println("Vehicle is Starting Vroom Vroom...");
	}
	
	public void stop () {
		System.out.println("Vehicle is Stopped.");
	}
}
