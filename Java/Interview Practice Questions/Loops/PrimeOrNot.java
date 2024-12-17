import java.util.Scanner;

public class PrimeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number to check is it prime or not ? ");
    int num = sc.nextInt();
    boolean Prime = isPrime(num);

    if (Prime) {
      System.out.println("Given Number is Prime Number.");
    } else {
      System.out.println("Given Number is Not A Prime Number.");
    }
  }

  public static boolean isPrime(int num) {
    int count = 0;
    if (num == 1) return false;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) count++;
    }

    boolean result = count == 0 ? true : false;
    return result;
  }
}
