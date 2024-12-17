



/*                                              Maths class in Java                                                  */



import java.util.Scanner;

public class Maths {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two numbers : ");

    int num1 = sc.nextInt();
    float num2 = sc.nextFloat();

    System.out.println("The minimum number between these two numbers : " + Math.min(num1, num2));
    System.out.println("The maximum number between these two numbers : " + Math.max(num1, num2));
    System.out.println("The square root of 1st number is : " + (int) Math.sqrt(num1));

    System.out.println("The absolute value of 2nd number is : " + Math.abs(num2));
    System.out.println("The Ceil value of 2nd number : " + Math.ceil(num2));
    System.out.println("The Floor value of 2nd number : "  + Math.floor(num2));
    System.out.println("The round off a 2nd number : "  + Math.round(num2));
    System.out.println("The result of num1 to the power of num2 : " + Math.pow(num1, num2));
    System.out.println("The Sin degree of 1st number is : " + Math.sin(num1));
    System.out.println("The value of constant pi is : " + Math.PI);
    System.out.println("The value of constant e in logarithmetic : " + Math.E);


  }
}
