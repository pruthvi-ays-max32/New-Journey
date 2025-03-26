import java.util.LinkedList;
import java.util.Queue;

/*
 *   Collection -> Queue -> LinkedList, Priority Queue
 * 
 *  FIFO order
 */

public class QueueInterface {
  public static void main(String[] args) {
    Queue <Integer> queue = new LinkedList<>();


    // to add -> add() -> throws exception if not able to add. ,offer() -> return false if not able to add
    queue.add(1);
    queue.offer(5);
    queue.add(3);
    queue.offer(8);

    // to remove -> remove() -> throws exception if queue is empty. , poll() -> return null if queue is empty.
    queue.remove();
    queue.poll();

    // to Retrive and not remove -> element() -> throws exception if queue is empty. , peek() -> return null if queue is empty.
    queue.peek();
    queue.element();

    // created a utility class which takes any collection as input and print elements present in it.
    Utility.print(queue);
  }
}
