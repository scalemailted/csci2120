import java.util.HashMap;
import java.util.Map.Entry;
public class IterateHashMapTester4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(1012, " John");
        hmap.put(1202, " Ricky");
        hmap.put(1303, " Deep");
        hmap.put(1404, " Mark");
        hmap.put(1505, " Maya");

        // Iterating over entries of a map using entrySet() method.
        for (Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Id: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
