public class WrapperClas {
  public static void main(String[] args) {

    int ptype = 56;
    // ways to define variable of wrapper class.
    Integer x = 23;
    Integer z = Integer.valueOf(45);
    System.out.println(x + z);
    // autoboxing -> convert primitive to Object.

    int first = z;

    // Unboxing -> convert Object to primitive.
    Integer wtype = ptype;
    System.out.println(first + " " + wtype);

  }
}