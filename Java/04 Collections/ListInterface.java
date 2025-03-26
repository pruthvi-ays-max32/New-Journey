import java.util.ArrayList;
import java.util.List;

/*
         Collection -> List  -> ArrayList, LinkedList, Vector

         Ordered, Duplicate elements
 */

public class ListInterface{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    // Add Element
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");

    // // Add Element Perticular index
    // list.add(1,"Date");

    // // update element at perticular index 
    // list.set(2, "Graphes");

    // // check that element is present or not
    // System.out.println(list.contains("date"));

    // // remove element by index
    // System.out.println(list.remove(0));

    // // remove element by element
    // System.out.println(list.remove("Banana"));

    // // remove all elements.
    // list.clear();

    for(String fruit : list){
      System.out.print(fruit + " ");
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}