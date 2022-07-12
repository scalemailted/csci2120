import java.util.ArrayDeque;
public class ArrayDequeTester3 {
    public static void main(String[] args) {
        ArrayDeque<String> dq= new ArrayDeque<String>();

        dq.add("One");
        dq.addFirst("Two");
        dq.addLast("Three");

        // Displaying elements of ArrayDeque.
        System.out.println("Elements in ArrayDeque : " + dq);

        // Remove element as a stack from top/front end.
        System.out.println(dq.pop());

        // Remove element as a queue from front
        System.out.println(dq.poll());

        // Remove element from front end.
        System.out.println(dq.pollFirst());

        // Remove element from back end.
        System.out.println(dq.pollLast());
    }
}
