/*
 * 
 *  Conditional Statements In Java :-
 * 
 *      1. If Statement : based on condition inside the if block we can define that code block should run or not.
 *          Syntax :- if(condition) {
 *                              code block 
 *                          }
 * 
 *      2. If else Statement : it is like either or condition if statement false then the else part will execute.
 * 
 *      3. Nested if else / if else ladder : it's nothing just the nested if else statements in various manner.
 * 
 *      4. Switch Case : (Choice from multiple.)
 * 
 *      // Normal Switch Case
 * 
 *        switch (variable3){
 *              case variable1 : Expressions to be extecuted.
 *                              break;
 *              case variable2 : Expressions to be extecuted.
 *                              break;
                case variable3 : Expressions to be extecuted.
 *                              break;
 *              default : Expressions to be extecuted.      // Break is optional for default case.
 *         }
 * 
 * 
 *      // Modern Switch Case : No need to right the break statement.
 * 
 *      String day = switch (2){  
 *            
 *            case 1 -> "Monday";
 *            case 2 -> "Tuesday";
 *            case 3 -> "Wednesday";
 *            default -> "Invalid";
 *       }
 * 
 *        Sysout (day);
 */


public class Conditional {
  public static void main(String[] args) {
    

    // if statement 
      int age = 28;
      if(age>18){
        System.out.println("He can Vote.");
      }


    //  nested if else 

    if(age>18){
      System.out.println("He can vote");
      if(age<21){
        System.out.println("He is not eligible for marriage.");
      }else{
        System.out.println("He is eligible for the marriage.");
      }
    }
    else{
      System.out.println("He can't vote.");
    }


    // Normal Switch Case 

    int number = 3;
    switch (number) {
      case 1:
        System.out.println("Today is Monday");
        break;
      case 2:
        System.out.println("Today is Tuesday");
        break;
      case 3:
        System.out.println("Today is Wednesday");
        break;
      case 4:
        System.out.println("Today is Thursday");
        break;
      case 5:
        System.out.println("Today is Friday");
        break;
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday.");
        break;
    
      default: System.out.println("Invalid.");
        break;
    }


    // modern switch case

    String Day = switch(number){
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      case 7 -> "Sunday";
      default -> "Invalid";
    };

    System.out.println("Today is " + Day);
  }
}
