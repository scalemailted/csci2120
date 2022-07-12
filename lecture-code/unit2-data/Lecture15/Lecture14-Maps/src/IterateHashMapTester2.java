import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class IterateHashMapTester2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(5, "Five");
        hmap.put(10, "Ten");
        hmap.put(15, "Fifteen");
        hmap.put(20, "Twenty");
        hmap.put(25, "Twenty-five");
        hmap.put(30, "Thirty");

        // entrySet is a method that is used to get view of entries of a map.
        Iterator<Entry<Integer, String>> itr = hmap.entrySet().iterator();
        System.out.println("Iterating Entries of HashMap");
        while(itr.hasNext()) {
            Object key = itr.next();
            System.out.println(key);
        }
        // Removing last entry returned by Iterator
        itr.remove(); // This method will remove last entry of a hash map while iterating.
        System.out.println("Entries of HashMap after removing: " +hmap.entrySet());
    }
}
