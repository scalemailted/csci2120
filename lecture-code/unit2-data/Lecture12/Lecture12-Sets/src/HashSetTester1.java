import java.util.HashSet;
public class HashSetTester1 {
    public static void main(String[] args) {
        // Create a HashSet object.
        HashSet<String> set = new HashSet<String>(); // An empty hash set.

        // Adding elements to HashSet.
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");
        set.add("Fifth");

        // Adding duplicate elements that will be ignored.
        set.add("First");
        set.add("Third");

        // Adding of null elements.
        set.add(null);
        set.add(null); // Ignored.
        System.out.println("Unordered and No Duplicate HashSet Elements");
        System.out.println(set);
    }
}


