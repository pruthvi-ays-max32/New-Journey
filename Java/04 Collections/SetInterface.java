import java.util.HashSet;
import java.util.Set;

/*
 *   Collection -> Set -> HashSet, LinkedHashSet, TreeSet
 * 
 * unordered, unique values.
 */
public class SetInterface {
  public static void main(String[] args) {
    Set <String> names = new HashSet<>();

    // add 
    System.out.println(names.add("John"));
    System.out.println(names.add("Mary"));
    System.out.println(names.add("Akshay"));

    Utility.print(names);

    // to remove
    System.out.println(names.remove("Akshay"));

    Utility.print(names);

    // contains or not
    System.out.println(names.contains("John"));

    // size()
    System.out.println(names.size());

    // empty or not
    System.out.println(names.isEmpty());

  }
}
