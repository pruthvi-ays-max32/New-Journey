
/*
          StringBuilder : 
                  - It is faster than string. 
                  - reduces memory uses bcz it uses append method instead of concatenation of strings.
                  - mutable string.
*/


public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hi, I am ");
    sb.append("kunal.");
    System.out.println(sb);   
  }
}
