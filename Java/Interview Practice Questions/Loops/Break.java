
/*
        Q : Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.
 */

import java.util.Scanner;

public class Break {

  // // Method 1:
  // public static void main(String[] args) {
  //     Scanner sc = new Scanner(System.in);
  //     String str = "exit";
  //     String newStr;
  //     do{
  //       System.out.println("Enter the Input : ");
  //       newStr = sc.next();
  //     }while(! isExit(str, newStr));

  //     System.out.println("Successfully Break the Loop.");
  // }

  // public static boolean isExit(String str, String newStr){
  //   return str.equals(newStr);
  // }


  // Method 2
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String newStr;
    while(true){
      System.out.println("Enter the Input : ");
      newStr = sc.next();
      if(newStr.equals("exit")){
        break;
      }
    }

    System.out.println("Successfully Break the Loop.");
  }
}
