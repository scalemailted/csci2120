import java.util.ArrayDeque;
public class ArrayDequeTester1 {
    public static void main(String[] args) {
        // Create object of ArrayDeque class of String type.
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        // Adding elements to deque using add() method.
        dq.add(10);
        dq.addFirst(20);
        dq.addLast(05);

        // Adding elements to deque using offer() method.
        dq.offer(30);
        dq.offerFirst(50);
        dq.offerLast(40);

        System.out.println("Elements in ArrayDeque : " + dq);
    }
}
