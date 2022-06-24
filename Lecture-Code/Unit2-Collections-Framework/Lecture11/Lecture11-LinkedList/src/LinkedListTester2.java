import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListTester2 {
    public static void main(String[] args) {
        // Create a generic LinkedList object of type String.
        LinkedList<String> list = new LinkedList<String>();
        int size = list.size();
        System.out.println("Size of Linkedlist: " +size);

        // Adding elements of String type.
        list.add("Zero");
        list.add("First");
        list.add("Second");
        list.add(null); // null elements are allowed in the linked list.
        list.add("Fourth");
        list.add("25");
        System.out.println("Initial LinkedList order: " +list);

        // Removing the first element from list using removeFirst() method.
        list.removeFirst();
        System.out.println("LinkedList Elements after removing the first element");
        System.out.println(list);

        // Removing the last element from the list using removeLast() method.
        System.out.println("LinkedList Elements after removing the last element");
        list.removeLast();
        System.out.println(list);

        // Removing element at the specified position from the list.
        list.remove(2);
        System.out.println("LinkedList Elements after removing the element at index position 2 ");
        System.out.println(list);

        // Adding all elements from existing an ArrayList collection to the end of LinkedList.
        // Creating a generic ArrayList object of String type.
        ArrayList<String> al = new ArrayList<String>();
        al.add("Third");
        al.add("Fourth");

        list.addAll(2, al);
        list.removeLastOccurrence("Fourth");

        System.out.println("LinkedList Elements after removing last occurrence");
        System.out.println(list);
    }
}


