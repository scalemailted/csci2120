import java.util.Iterator;
import java.util.LinkedList;
public class IterateLinkedListTester2 {
    public static void main(String[] args) {
        // Create a generic LinkedList object of Character type.
        LinkedList<Character> list = new LinkedList<Character>();

        // Adding elements in the list.
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        // Iterating using Iterator.
        System.out.println("**Using Iterator**");
        Iterator<Character> itr = list.iterator();
        while(itr.hasNext()) {
            Object obj = itr.next();
            System.out.println(obj);
        }
    }
}

