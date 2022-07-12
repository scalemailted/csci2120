import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorTester2 {
    public static void main(String[] args) {
        // Create an object of Descend class.
        Descend ds = new Descend();

        // Create a tree set and pass the reference variable of Descend class as a parameter.
        TreeSet<Integer> ts = new TreeSet<Integer>(ds);

        // Adds elements into tree set.
        ts.add(25);
        ts.add(15);
        ts.add(30);
        ts.add(10);
        ts.add(40);
        ts.add(05);

        // Display the elements in ascending order.
        System.out.println("Sorted in Descending order");

        for(Integer element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

// To sort elements into descending order.
class Descend implements Comparator<Integer>{
    @Override // Implement compare() method to reverse for the integer comparison.
    public int compare(Integer i1, Integer i2) {
        // For reverse comparison.
        return i2.compareTo(i1);
    }
}
