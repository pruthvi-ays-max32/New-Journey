
/* 
      Q : Create a program to crea ea Simp e ca cu a or a uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
*/


import java.util.*;
public class Calci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Two Numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("Enter the Operation character which operation you wanna perform '+' / '-' / '*' / '/'  ");
    String opNum = sc.next();

    String result = switch(opNum){
      case "+" -> (num1 + num2) + " is addition result";
      case "-" -> num1 - num2 + " is subtraction result";
      case "*" -> num1 * num2 + " is multiplication result";
      case "/" -> num1 / num2 + " is division result";
      default -> "Invalid Operation Digit.";
    };

    System.out.println("Result is : " + result);

  }
}
