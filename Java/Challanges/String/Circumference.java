package String;

import java.util.Scanner;

// Q : Calculate the area and circumference of a circle for a given radius using Math.Pl

public class Circumference {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle : ");
    double r = sc.nextDouble();
    double cirf = 2 * Math.PI * r;
    System.out.printf("The circuference of circle with radius %f is %f.", r, cirf);
  }
}
