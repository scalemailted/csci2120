import java.util.ArrayDeque;
public class ArrayDequeTester2 {
    public static void main(String[] args) {
        // Creating an empty ArrayDeque instance.
        ArrayDeque<Integer> dq= new ArrayDeque<Integer>();

        dq.add(25);
        dq.add(50);
        dq.add(75);
        dq.add(100);
        dq.add(125);

        // Displaying elements of ArrayDeque.
        System.out.println("ArrayDeque: " + dq);
        System.out.println("First element is: " + dq.getFirst());
        System.out.println("Last element is: " + dq.getLast());
    }
}
