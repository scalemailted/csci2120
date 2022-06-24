import java.util.LinkedList;
public class IterateLinkedListTester1 {
    public static void main(String[] args) {
        // Create a generic LinkedList object of String type.
        LinkedList<String> list = new LinkedList<String>(); // An empty list.

        // Adding elements in the list.
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");

        // Iterating using for loop.
        System.out.println("**For loop**");
        for(int i = 0; i < list.size(); i++) {
            Object element = list.get(i); // Return type of get() method is an Object.
            System.out.println(element);
        }
        // Iterating using Advanced for loop.
        System.out.println("**Advanced For loop**");
        for(String str: list) {
            System.out.println(str);
        }
        // Iterating using while loop.
        System.out.println("**While Loop**");
        int num = 0;
        while (list.size() > num) {
            System.out.println(list.get(num));
            num++;
        }
    }
}

