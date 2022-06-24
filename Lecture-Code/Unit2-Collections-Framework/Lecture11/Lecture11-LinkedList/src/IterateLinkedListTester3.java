import java.util.LinkedList;
import java.util.ListIterator;
public class IterateLinkedListTester3 {
    public static void main(String[] args) {
        // Create a generic LinkedList object of type Integer.
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Adding elements in the list.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("LinkedList original order");
        System.out.println(list);

        ListIterator<Integer> litr = list.listIterator();
        System.out.println("Interating in forward direction");
        while(litr.hasNext()) {
            Object obj = litr.next();
            System.out.println(obj);
        }
        System.out.println("Iterating in backward direction");
        while(litr.hasPrevious()) {
            Object obj1 = litr.previous();
            System.out.println(obj1);
            list.add(60); // throws Concurrent Modification Exception because we cannot add or remove element in the LinkedList during iteration.
        }
        System.out.println(list);
    }
}
