import java.util.Scanner;
public class PositiveOrNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Number to check it is positive or negative : ");

    int num = sc.nextInt();

    String result = num<0 ? "Negative." : num==0 ? "Zero." : "Positive.";

    System.out.println(num + " is " + result);
  }
}
