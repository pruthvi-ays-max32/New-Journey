

/*
          Q : Create a program to print t e mont 0 t e year ase on a number (1-12) input by the user.
 */


import java.util.*;
public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the month number : ");
    int num = sc.nextInt();

    String month = switch(num){
      case 1 -> "Jan";
      case 2 -> "Feb";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "Aug";
      case 9 -> "Sept";
      case 10 -> "Oct";
      case 11 -> "Nov";
      case 12 -> "Dec";
      default -> "Invalid Month Number";
    };

    System.out.println("Month Related to enterd number is : " + month);
  }
}
