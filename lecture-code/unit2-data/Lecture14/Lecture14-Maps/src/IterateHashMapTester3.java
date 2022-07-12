import java.util.HashMap;
public class IterateHashMapTester3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(5, "Five");
        hmap.put(10, "Ten");
        hmap.put(15, "Fifteen");
        hmap.put(20, "Twenty");
        hmap.put(25, "Twenty-five");
        hmap.put(30, "Thirty");

        // Iterating over keys of a hashmap using keySet() method.
        for (Integer num : hmap.keySet())
            System.out.println("Number: " +num);
        System.out.println();

        // Iterating over values of a hashmap using values() method.
        for (String word : hmap.values())
            System.out.println("Word: " +word);
    }
}
