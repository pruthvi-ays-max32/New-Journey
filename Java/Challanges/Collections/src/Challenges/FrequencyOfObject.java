package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 		Q: Use the Collections class to count the frequency of a particular element in an ArrayList.
*/

public class FrequencyOfObject {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,7,8,5,4,1,4,7,1);
		int frequencyOf1 = Collections.frequency(list,1);
		System.out.println(frequencyOf1);
		
		int frequencyOf4 = Collections.frequency(list,4);
		System.out.println(frequencyOf4);
	}

}
