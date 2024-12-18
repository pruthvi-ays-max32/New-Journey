
/*
      Q : Create a program using for-each to find the maximum value in an integer array.
      Q : Create a program using for-each to the occurrences of a specific element in an Array.
*/

import java.util.Scanner;

public class ForEach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 10, 20, 30, 40, 50, 70, 90, 80, 70, 80, 50, 70 };


    // Find Maximum In array
    int max = maxValueInArray(arr);
    System.out.println("Largest Element in Given Array is : " + max);


    // Find Occurance of Given Number in Array.
    System.out.println("Enter the number whose number of occurance in array we have to find. ");
    int num = sc.nextInt();

    int occ = OccuranceOfNum(num, arr);
    System.out.println("Occurance of Element " + num + " in given array is " + occ);
  }


// Maximum Value in an array.
  public static int maxValueInArray(int[] arr) {
    int max = arr[0];

    for (int x : arr) {
      if (x > max)
        max = x;
    }
    return max;
  }

// Occurance of a element in array 
  public static int OccuranceOfNum(int num, int[] arr){
    int count = 0;
    for(int x : arr){
      if(num == x) count++;
    }
    return count;
  }
}
