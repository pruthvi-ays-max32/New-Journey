package Challenges;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		Set <Character> characterArray = new HashSet<>();
		characterArray = uniqueCharCount(characterArray,str);
		System.out.println("Unique characters in your string are : ");
		System.out.println(characterArray);
		System.out.println("the count of unique chsaracters is " + characterArray.size());
	}
	
	public static Set<Character> uniqueCharCount(Set <Character> characterArray ,String str) {
		for(int i=0; i<str.length(); i++) {
			// to skip spaces.
			if (str.charAt(i) != ' ') {
                characterArray.add(str.charAt(i));
            }
		}
		return characterArray;
	}
}
