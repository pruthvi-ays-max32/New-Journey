import java.util.Scanner;

public class OddOrEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to determine whether it is odd or even. ");

    int num = sc.nextInt();
    if(num%2==0){
      System.out.println("Given Number is Even.");
    }
    else{
      System.out.println("Given Number is Odd.");
    }
  }
}
