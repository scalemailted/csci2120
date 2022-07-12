import java.util.HashMap;
import java.util.Map;
public class IterateMapTester4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, " John");
        map.put(202, " Ricky");
        map.put(303, " Deep");
        map.put(404, " Mark");
        map.put(505, " Maya");

        // Iterating over entries of a map using entrySet() method
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Roll No: " + key + ", Name: " + value);
        }
    }
}
