package String;

import java.util.Scanner;

/*
        Q : Create a number guessing game where the program selects a random number, and the user has to guess it. 
*/

public class RandomNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long Rnumber = Math.round(Math.random() * 100) ;
    System.out.println(Rnumber);
    int guess;
    do{
      System.out.println("Guess The Number between 1 to 99.");
      guess = sc.nextInt();
      if(guess == Rnumber) {
        System.out.println("You guessed Right Number.");
        break;
      }else if(guess>Rnumber){
        System.out.println("Too High ... ");
      } else{
        System.out.println("Too Low ... ");
      }
    }while(true);
  }
}
