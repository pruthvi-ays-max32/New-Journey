package throwKeyword;

public class TemperatureException extends RuntimeException{
	private double degree;

	public TemperatureException(double degree) {
		this.degree = degree;
	}

	public double getDegree() {
		return degree;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	public String getMessage() {
		return "The temperature should be normal and this is customized exception." + getDegree();
	}
	
	
}
