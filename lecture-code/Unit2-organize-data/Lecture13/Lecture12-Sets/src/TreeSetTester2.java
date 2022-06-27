import java.util.TreeSet;
public class TreeSetTester2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        // Add Strings to tree set.
        ts.add("India");
        ts.add("USA");
        ts.add("Australia");
        ts.add("New zealand");
        ts.add("Switzerland");

        // Checking for a specific element in set.
        boolean element = ts.contains("USA");
        System.out.println("Is USA in TreeSet: " +element);

        // Removing element from the tree set.
        ts.remove("New zealand");
        System.out.println("Sorted tree set: " +ts);
        ts.clear();
        System.out.println("Elements in tree set: " +ts);
    }
}
