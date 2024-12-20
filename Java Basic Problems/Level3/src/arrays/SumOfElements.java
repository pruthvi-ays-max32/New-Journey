package arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("The sum of elements in Array : " + sum);
		
		int avg = sum/arr.length;
		System.out.println("The Average of elements in Array : " + avg);
	}

}
