package String;

import java.util.Scanner;

// Q : Take an array of words and concatenate them into a single string using StringBuilder.


public class Challenge3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String arr [] = {"My", " Bestii", " is", " Akanksha."};

    StringBuilder sb = new StringBuilder();

    for(String x : arr){
      sb.append(x);
    }

    System.out.println("The New String generated from appending array is : " + sb);
  }
}
