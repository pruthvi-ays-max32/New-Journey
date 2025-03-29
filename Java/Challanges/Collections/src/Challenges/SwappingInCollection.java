package Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*
  Q : Write a method that swaps two elements in an ArrayList, given their indices. 
*/
public class SwappingInCollection {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,2,4,8,6,3,2,1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Give two index to swap elements present on it : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("list before swapping" + list);
		swap(list,x,y);
		System.out.println("list after swapping" + list);
		
	}
	
	public static void swap(List<Integer> list, int x, int y) {
		Integer temp = list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);	
	}

}
