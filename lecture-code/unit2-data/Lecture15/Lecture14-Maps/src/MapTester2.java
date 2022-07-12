import java.util.HashMap;
import java.util.Map;
public class MapTester2 {
    public static void main(String[] args) {
        // Create a map of generic type.
        Map<Integer, String> map = new HashMap<>();

        // Adding entries in the map.
        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Yellow");
        map.put(104, "Blue");
        map.put(106, "Pink");

        // Removing an entry for the specified key.
        map.remove(104);
        System.out.println("Entries in Map after removing an entry: " +map);

        // Removing specified value associated with the specified key from the map.
        map.remove(106,"Pink");
        System.out.println("Entries in Map after removing Pink: " +map);
        map.clear();
        System.out.println(map);
    }
}
