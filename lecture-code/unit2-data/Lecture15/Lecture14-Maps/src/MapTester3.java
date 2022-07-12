import java.util.HashMap;
import java.util.Map;
public class MapTester3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("A", "Apple");
        map.put("B", "Boy");
        map.put("C", "Cat");
        map.put("D", "Dog");
        map.put("E", "Elephant");

        System.out.println("Orignal Entries in Map: " +map);
        // Replacing a specified value for a specified key.
        map.replace("E", "Element");
        System.out.println("Updated Entries in Map after replacing: " +map);

        // Replace old value with a new value.
        map.replace("B", "Boy", "Bucket");
        System.out.println(map);
    }
}
