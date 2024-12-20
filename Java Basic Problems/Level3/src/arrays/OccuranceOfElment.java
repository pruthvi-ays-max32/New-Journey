package arrays;

public class OccuranceOfElment {

	public static void main(String[] args) {
		int num = 20;		
		int arr[] = {10,20,20,30,40,50,20,10};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(num == arr[i]) {
				count++;
			}
		}
		
		System.out.println("The Occurance of " + num + " In array is : " + count);
	}

}
