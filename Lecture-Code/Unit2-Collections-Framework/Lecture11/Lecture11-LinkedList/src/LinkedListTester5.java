import java.util.LinkedList;
public class LinkedListTester5 {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<Character>();

        // Adding elements in the list.
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println("Initial LinkedList order");
        System.out.println(list);
        Object element = list.pop(); // Return type of this method is an Object.

        System.out.println("Pops Element: " +element);
        list.push('B');
        System.out.println("LinkedList Element after pushing");
        System.out.println(list);
    }
}

