

/*
        Final :  when we declare final use only capital letters not mendatory.       
            1. Variable: When applied to a variable, it becomes a constant, meaning its value cannot be changed once initialized.
            2. Efficiency: Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.
            3. Null Safety: A final variable must be initialized before the constructor completes, reducing null pointer errors.
            4. Immutable Objects: Helps in creating immutable objects in combination with private fields and no setter methods.
*/


public class FinalKeyword {

  public final static String myCrush = "Kala";
  public static void main(String[] args) {
    System.out.println(myCrush);
  }
}
