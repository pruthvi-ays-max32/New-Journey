import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
  public static void main(String[] args) {
    List <Integer> list = new ArrayList<>();

    list.add(4);
    list.add(1);
    list.add(8);
    list.add(-77);
    System.out.println("Normal List : ");
    Utility.print(list);
    System.out.println();

    // sort list
    System.out.println("Sorted List : ");
    Collections.sort(list);
    Utility.print(list);
    System.out.println();

    // Searching in the list : list must be sorted.
    System.out.println("Index of 8 : " + Collections.binarySearch(list, 8));

    // reverse list
    System.out.println("Reversed Sorted List : ");
    Collections.reverse(list);
    Utility.print(list);
    System.out.println();

    // min and max from list
    System.out.println("Min : " + Collections.min(list));
    System.out.println("Max : " + Collections.max(list));

  
    // create unmutable list

    List <Integer> unmodifiableList = Collections.unmodifiableList(list);
    System.out.println("Unmodifiable List : ");
    Utility.print(unmodifiableList);

  }
}
