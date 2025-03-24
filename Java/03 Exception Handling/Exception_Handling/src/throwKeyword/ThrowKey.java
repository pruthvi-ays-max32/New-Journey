package throwKeyword;

public class ThrowKey {

	public static void main(String[] args) {
		double a = 101.2;
		double b = 100;
		
		if(a>b) {
			throw new TemperatureException(a);
		} else {
			System.out.println("Temperature is normal.");
		}
	}
}
