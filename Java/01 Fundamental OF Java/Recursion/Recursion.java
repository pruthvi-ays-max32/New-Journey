
/*
            Recursion : self calling function. (function calls itself.)
              - to prevent infinite loop add a base condition.
              - it is ideal to use in problems which are divisible into smaller problems.
              - Excessive recursion can cause stack overflow errors.
 */

import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to calculate factorial.");
    int num = sc.nextInt();

    // long fact = factorial(num);
    long fact = RFactorial(num);
    System.out.println("Factorial of Given number is : " + fact);
  }

  // Normal Method.
  public static long factorial(int num) {
    long result = 1;

    for (int i = 1; i <= num; i++) {
      result = result * i;
    }
    return result;
  }

  // Using Recursion
  public static long RFactorial(int num) {
    if (num == 1) {
      return 1;
    }
    return num * RFactorial(num-1);
  }
}
