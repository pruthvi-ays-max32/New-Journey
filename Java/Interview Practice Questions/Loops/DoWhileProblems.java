
/*
      Q : Create a program using do-while to find password checker until a valid password is entered.
      Q : Create a program using do-while to implement a number guessing game.
 */

import java.util.Scanner;

public class DoWhileProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q : Is Valid Password.
        String password;
        do{
            System.out.println("Enter Password : ");
            password = sc.next();
            
        }while(!(isValidPassword(password)));
        System.out.println("You have Entered Valid Password.");

        // Q : Guess The Number 
        int guess;
        double X = Math.random()*100;
        int Number = (int) X;
        do{
            System.out.println("Guess The Number : ");
            guess = sc.nextInt();
        }while(!(isGuessCorrect(guess, Number)));

        System.out.println("You Guessed Right Number");


        // Check Enterd Password is same or not.
        String Password = "Kalyani@123";
        String pwd;
        do{
            System.out.println("Enter the Password : ");
            pwd = sc.next();

        }while(!(isSamePassword(pwd, Password)));
        System.out.println("You Entered Correct Password.");

    }

    public static boolean isValidPassword(String password){
        // if password length is equal to 6 then it is a valid password
        return password.length()==6;
    }

    public static boolean isGuessCorrect(int guess, int Number ){
        System.out.println("Guess :" + guess + " Number : " + Number);
        return Number == guess;
    }

    public static boolean isSamePassword(String pwd, String Password){
        return pwd.equals(Password);
    }
}
