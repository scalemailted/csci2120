import java.util.HashMap;
import java.util.Map;
public class MapTester1 {
    public static void main(String[] args) {
        // Create a map of generic type.
        Map<Integer, String> map = new HashMap<>();

        // Checking map is empty or not.
        boolean isEmpty = map.isEmpty();
        System.out.println("Is Map is empty? " +isEmpty);

        // Adding entries in the map. Call put() method to add entries in map.
        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Yellow");
        map.put(104, "Blue");
        map.put(106, "Pink");

        System.out.println("Entries in Map: " +map);
        int size = map.size();
        System.out.println("No. of entries in Map: " +size);

        // Create another map.
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(115, "Brown");
        map2.put(120, "Purple");
        map2.put(125, "Green");
        map.putAll(map2);
        System.out.println("Entries in updated Map: " +map);
    }
}

