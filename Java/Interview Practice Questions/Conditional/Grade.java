import java.util.Scanner;
public class Grade {
  public static void main(String[] args) {
    System.out.println("Enter the marks of Each Subject Respectively (Maths, Science, English, Marathi, Sanskruit, Social Science.)");
    Scanner sc = new Scanner(System.in);
    int maths = sc.nextInt();
    int Science = sc.nextInt();
    int English = sc.nextInt();
    int Marathi = sc.nextInt();
    int Sanskruit = sc.nextInt();
    int Social_science = sc.nextInt();

    int total = maths + Science + English + Marathi + Sanskruit + Social_science;
    
    if(total>=550){
      System.out.println("First Class With Distinction.");
    }
    else if(total>=450){
      System.out.println("First Class.");
    }
    else if(total>=350){
      System.out.println("Second Class.");
    }
    else{
      System.out.println("You failed !!! Better luck next time.");
    }
  }
}
