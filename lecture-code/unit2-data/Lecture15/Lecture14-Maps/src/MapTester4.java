import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapTester4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("B", "B");
        map.put("D", "H");
        map.put("A", "A");
        map.put("C", "R");
        map.put("E", "T");

        Set<String> keys = map.keySet();
        System.out.println("Set view of keys: " +keys);

        Collection<String> values = map.values();
        System.out.println("Collection view of values: " +values);
    }
}
