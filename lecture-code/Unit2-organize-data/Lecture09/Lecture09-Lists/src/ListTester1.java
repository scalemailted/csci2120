import java.util.ArrayList;
import java.util.List;
public class ListTester1 {
    public static void main(String[] args) {
        // Create a List.
        List al = new ArrayList();  // Here, there is no use of generic. So, no type safety.
        // We can add both integer and string elements.

        // Adding elements using add() method with reference variable al.
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add("Shubh");

        // Adding element to 4th position.
        al.add(4, 35);

        // Adding element to 5th position.
        al.add(5, 45);

        System.out.println("Elements after adding: " +al);
    }
}

