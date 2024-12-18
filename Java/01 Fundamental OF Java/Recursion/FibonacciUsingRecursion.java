import java.util.Scanner;

public class FibonacciUsingRecursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Count of Numbers in Fibonacci Series which we want to print.");
    int count = sc.nextInt();

  // Using Recursion
    for(int i=0; i<count; i++){
      System.out.print(fibonacci(i) + " ");
    }


  // // Normal Method To calculate Fibonacci Series
  //   int num1 = 0;
  //   int num2 = 1;
  //   if(count<1 && count==0) System.out.println(num1);
  //   else if(count<2) System.out.println(num1 + " " + num2);
  //   else {
  //     System.out.print(num1 + " " + num2 + " ");
  //     for(int i=1; i<=count-2; i++){
  //       int temp = num2;
  //       num2 = num1 + num2;
  //       num1 = temp;
  //       System.out.print(num2 + " ");
  //     }
  //   }

  }

  public static int fibonacci(int index){
    if(index == 0) return 0;
    else if(index == 1) return 1;
    else return fibonacci(index-2) + fibonacci(index-1);
  }
}
