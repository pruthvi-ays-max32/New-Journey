package arrays;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,10,3,40,50};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("The Minimum Element In Array is : " + min);
		System.out.println("The Maximum Element in array is : " + max);
	}

}
