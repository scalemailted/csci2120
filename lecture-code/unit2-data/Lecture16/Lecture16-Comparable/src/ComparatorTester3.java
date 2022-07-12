import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorTester3 {
    public static void main(String[] args) {
        // Create an object of RevStrComp class.
        RevStrComp rsc = new RevStrComp();

        // Create a tree set and pass reference variable of RevStrComp class as parameter.
        TreeSet<String> ts = new TreeSet<String>(rsc);

        // Adds elements into tree set.
        ts.add("Cat");
        ts.add("Elephant");
        ts.add("Lion");
        ts.add("Dog");
        ts.add("Tiger");
        ts.add("Horse");

        // Display the elements in ascending order.
        System.out.println("Sorted in reverse order");

        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}

// To sort elements into descending order.
class RevStrComp implements Comparator<String> {
    @Override // Implements compare() method for reverse string comparison.
    public int compare(String str1, String str2) {
        // For reverse comparison.
        return str2.compareTo(str1);
    }
}