package String;

/*
      Q : Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase.  
*/
public class Challenge2 {
  public static void main(String[] args) {
    String str1 = "Hi, Nice to meet You.";
    String str2 = new String(" How you doing ?");

    String concStr = str1 + str2;
    System.out.println(concStr.toUpperCase());
  }
}
