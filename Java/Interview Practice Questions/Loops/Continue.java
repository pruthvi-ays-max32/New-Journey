
/*
      Q : Create a program using continue to sum all positive numbers entered by the user skip any negative numbers.
      Q : Create a program using continue to print only even numbers using continue for odd numbers. 
*/

import java.util.Scanner;

public class Continue {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


// // Q : Sum of Positive Numbers Only
//     int num, sum = 0;
//     do {
//       System.out.println("Enter Positive Number to Add : ");
//       num = sc.nextInt();
//       if(num<0){
//         continue;
//       }
//       sum = sum + num;
//       System.out.println("The Current Addition Result is : " + sum);
//     } while (true);

// Q : Print Only Even Numbers.
    for(int i=0; i<=100; i++){
      if(i%2!=0) continue;
      System.out.print(i + " ");
    }

  }
}
