import java.util.LinkedList;
public class LinkedListTester4 {
    public static void main(String[] args) {
        // Create a LinkedList object.
        LinkedList<String> list = new LinkedList<String>();

        // Adding elements to the list.
        list.add("INDIA");
        list.add("USA");
        list.add("JAPAN");
        list.add("UK");
        list.add("CANADA");
        System.out.println("Initial LinkedList order");
        System.out.println(list);

        // Call peek() method to retrieve the first element from list.
        Object firstElement = list.peekFirst(); // Return type of this method is an Object.
        System.out.println("Retrieve the first element: " +firstElement);
        Object lastElement = list.peekLast();
        System.out.println("Retrieve the last element: " +lastElement);

        // Call pollLast() to retrieve and remove the last element from the list.
        Object element1 = list.pollLast();
        System.out.println("Retrieve and remove the last element: " +element1);
        System.out.println("LinkedList Element after using pollLast() method");
        System.out.println(list);
    }
}

