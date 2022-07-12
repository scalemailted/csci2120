import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorTester1 {
    public static void main(String[] args) {
        // Create an object of Ascend class.
        Ascend as = new Ascend();

        // Create a tree set and pass the reference variable of Ascend class as a parameter.
        TreeSet<Integer> ts = new TreeSet<Integer>(as);

        // Adds elements into treeset.
        ts.add(25);
        ts.add(15);
        ts.add(30);
        ts.add(10);
        ts.add(40);
        ts.add(05);

        // Display the elements in ascending order.
        System.out.println("Sorted in Ascending order");

        for(Integer element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

// To sort elements into ascending order.
class Ascend implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }
    // No need to override equals method.
}