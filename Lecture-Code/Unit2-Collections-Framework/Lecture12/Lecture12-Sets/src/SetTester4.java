import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetTester4 {
    public static void main(String[] args) {
        // Create a generic list object of type Integer.
        List<Integer> list = new ArrayList<Integer>();
        int size = list.size();
        System.out.println("Size before adding elements: " +size);
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original order of List Elements");
        System.out.println(list);

        Set<Integer> s = new HashSet<Integer>(list);
        System.out.println("Unordered List Elements after removing duplicates.");
        System.out.println(s);
    }
}

