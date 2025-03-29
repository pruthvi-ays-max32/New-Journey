package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Q : Write a program that sorts a list of String objects in descending order using a custom Comparator.
public class CustomComparator {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Kunal");
		list.add("Akanksha");
		list.add("Shriyash");
		list.add("Ganesh");
		
		System.out.println(list);
		sortedList(list);
		System.out.println(list);
	}
	
	public static void sortedList(List<String> list) {
		
		/*
		 Using built in methods.
				Collections.sort(list);
				Collections.reverse(list);
		*/
		
		// using custom comparator
		
		// used concept of anonymous inner class.
		
		Collections.sort(list, new java.util.Comparator<String>() {
			public int compare(String s, String t1) {
				if(s.equals(t1)) {
					return 0;
				} else if(s.charAt(0)<t1.charAt(0)){
					return 1;	
				} else {
					return -1;
				}
			}
		});
	}

}
