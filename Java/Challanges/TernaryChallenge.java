


/*
        Q : Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g.,High for scores > 80, Moderate for 50-80, Low for < 50).
 */



import java.util.*;
public class TernaryChallenge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student's Score : ");
    int score = sc.nextInt();

    String category = score>80 ? "HIGH" : score>50 ? "Moderate" : "LOW" ;
    System.out.println("The Category achieved by student is : " + category);
  }
}
