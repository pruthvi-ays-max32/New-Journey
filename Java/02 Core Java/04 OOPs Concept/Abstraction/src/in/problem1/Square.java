package in.problem1;

public class Square extends Shape {

	private double side;
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double calculateArea() {
		return Math.pow(side, 2);
	}
}
