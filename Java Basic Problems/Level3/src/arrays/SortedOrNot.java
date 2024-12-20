package arrays;

public class SortedOrNot {

	public static void main(String[] args) {
		int arr [] = {10,20,30,40,50};
		boolean sorted = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				continue;
			}
			else {
				sorted = false;
			}
		}
	
		if(sorted) {
			System.out.println("The Array Is Sorted.");
		}
		else {
			System.out.println("The Array is Not Sorted.");
		}
	}

}
