import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeTester4 {
    public static void main(String[] args) {
        ArrayDeque<String> dq= new ArrayDeque<String>();

        dq.add("One");
        dq.addFirst("Two");
        dq.addLast("Three");
        dq.add("Four");

        // Iterating over elements from the front end of the queue using iterator() method.
        System.out.println("Front End Iteration:");
        Iterator<String> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        // Iterating over elements in reverse order.
        System.out.println("Back End Iteration:");
        Iterator<String> itr2 = dq.descendingIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
