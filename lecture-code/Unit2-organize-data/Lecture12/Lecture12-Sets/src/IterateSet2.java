import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet2 {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.add("Mango");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            Object str = itr.next();
            System.out.println(str);
            set.add("Grapes"); // Add element during iteration, throws Exception.
        }
    }
}
