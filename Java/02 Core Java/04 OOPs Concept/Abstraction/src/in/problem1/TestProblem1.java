package in.problem1;

public class TestProblem1 {

	public static void main(String[] args) {
		Circle cr = new Circle();
		cr.setRadius(7);
		System.out.printf("Area of Circle of radius %5.2f is %5.2f. %n" ,cr.getRadius(), cr.calculateArea());
		
		Square sq = new Square();
		sq.setSide(5);
		System.out.printf("Area of Square of radius %5.2f is %5.2f " ,sq.getSide(), sq.calculateArea());
		
	}

}
