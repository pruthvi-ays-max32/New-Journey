package in.Challenge3;

public class Challenge3Test {

	public static void main(String[] args) {
		ArrayOperations outerClassObj = new ArrayOperations(new int[]{1,2,3,4,5,6,7,8,9,10});
		ArrayOperations.Statistics stat = outerClassObj.new Statistics();
		double mean = stat.mean();
		System.out.println(mean);
	}

}
