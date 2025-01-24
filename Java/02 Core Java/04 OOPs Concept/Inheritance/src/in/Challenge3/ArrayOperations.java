package in.Challenge3;

public class ArrayOperations {
	
	private int numbers [];
	
	ArrayOperations(int numbers[]){
		this.numbers = numbers;
	}

	public class Statistics {
		 double mean () {
			 double sum = 0;
			 for(int i=0; i<numbers.length; i++) {
				 sum = sum + numbers[i];
			 }
			return sum/numbers.length;
		}
	}
}
