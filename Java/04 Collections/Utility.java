import java.util.Collection;

public class Utility {
  public static <E>void print(Collection <E> coll){
      for (E element : coll) {
        System.out.println(element + " ");
      }
  }
}
