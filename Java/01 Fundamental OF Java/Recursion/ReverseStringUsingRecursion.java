import java.util.Scanner;

public class ReverseStringUsingRecursion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String to check is it palindrom or not ?");
    String str = sc.next();

    System.out.println("Given String is " + (isPalindrom(str) ? "a Palindrom" : "Not a Palindrom."));
  }

  public static boolean isPalindrom(String str){
    if(str.length()==1){
      return true;
    }
    int lastIndex = str.length()-1;
    if(str.charAt(0) != str.charAt(lastIndex)){
      return false;
    }else{
      String subStr = str.substring(1, lastIndex-1);
      isPalindrom(subStr);
    }
    return true;
  }
}
