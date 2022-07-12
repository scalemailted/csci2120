import java.util.HashMap;
import java.util.Map;
public class MapTester5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("V", "Violet");
        map.put("I", "Indigo");
        map.put("B", "Blue");
        map.put("G", "Green");
        map.put("Y", "Yellow");
        map.put("O", "Orange");
        map.put("R", "Red");

        String value = map.get("V"); // It will return a value for specified key in this map.
        System.out.println(value);

        boolean entryKey = map.containsKey("B");
        System.out.println(entryKey);

        boolean entryValue = map.containsValue("Brown");
        System.out.println(entryValue);
    }
}
