import java.util.LinkedList;
public class LinkedListTester3 {
    public static void main(String[] args) {
        // Create a LinkedList object.
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Adding even numbers from 0 to 20 as elements in the list.
        for(int i = 0 ; i <= 20; i++) {
            if(i % 2 == 0) // It will check even number.
                list.add(i);
        }
        // Call getFirst() method to get first even number.
        Object firstEvenNumber = list.getFirst(); // Return type of getFirst() methods is an Object.
        System.out.println("First even number: " +firstEvenNumber);
        Object lastEvenNumber = list.getLast();
        System.out.println("Last even number: " +lastEvenNumber);
        Object getElement = list.get(5);
        System.out.println("Even number at index 5: " +getElement);
    }
}

