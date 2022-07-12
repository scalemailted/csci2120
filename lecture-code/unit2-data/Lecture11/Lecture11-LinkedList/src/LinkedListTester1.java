import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class LinkedListTester1 {
    public static void main(String[] args) {
        // Create a LinkedList object.
        LinkedList list = new LinkedList(); // empty linked list.

        // Call add() method for adding Heterogeneous elements using reference variable list.
        list.add("One");
        list.add(2);
        list.add(null); // null elements are allowed in the linked list.
        list.add("Four");
        System.out.println("Initial LinkedList order: " +list);

        // Adding an element specified in the linked list.
        list.add(3, "Three");

        // Adding an element at the first position of list using addFirst() method of Deque interface.
        System.out.println("LinkedList Elements after adding the first element");
        list.addFirst("Zero");
        System.out.println(list);

        // Adding an element at the end of the list using addLast() method of Deque interface.
        System.out.println("LinkedList Elements after adding the last element");
        list.addLast("Five");
        System.out.println(list);

        // Adding all elements from existing ArrayList collection to the end of the LinkedList.
        // Create an ArrayList object.
        ArrayList al = new ArrayList();
        al.add("Six");
        al.add(7);
        al.add("Eight");

        // Call addAll() method to add all elements to the end of the linked list.
        list.addAll(al);
        System.out.println("LinkedList Elements after adding all elements from ArrayList");
        System.out.println(list);

        // Adding all elements from an existing Vector collection at the specified position of LinkedList.
        Vector v = new Vector();
        v.add(7.5);
        v.add(7.8);
        list.addAll(9, v);
        System.out.println("Linkedlist elements after adding all elements from vector");
        System.out.println(list);
    }
}

