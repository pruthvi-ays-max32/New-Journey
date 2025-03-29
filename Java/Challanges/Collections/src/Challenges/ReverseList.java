package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
  	Q : Create a program that reverses the elements of a List and prints the reversed list.
*/
public class ReverseList {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("Normal List :" + list);
		
//		// M1 : Built in method
//		Collections.reverse(list);
		
		// M2 : User Defined : by Swapping
		for(int i=0; i<list.size()/2; i++) {
			// previous question used
			SwappingInCollection.swap(list, i, list.size()-i-1);
		}
		System.out.println("Reversed List : " + list);
	}

}
