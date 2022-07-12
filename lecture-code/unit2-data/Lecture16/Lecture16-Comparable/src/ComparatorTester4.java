import java.util.Comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class ComparatorTester4 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Create an object of InputStreamReader class to accept array elements from the keyboard.
        InputStreamReader isr = new InputStreamReader(System.in);

        // Create an object of BufferedReader and pass the reference variable to its constructor.
        BufferedReader br = new BufferedReader(isr);

        System.out.println("How many elements do you want to enter?");
        int size = Integer.parseInt(br.readLine());

        // Create an array to store Integer type elements or objects.
        Integer arr[] = new Integer[size];

        // Now convert int values into Integer objects and then pass to array to store them.
        for(int i = 0; i < size; i++){
            System.out.println("Enter your number:");
            arr[i] = Integer.parseInt(br.readLine());
        }
        // Create an object of Ascend class.
        AscendArray as = new AscendArray();

        // Call sort() method to sort array elements in ascending order.
        Arrays.sort(arr, as); //  for sorting into ascending order.

        // Display the sorted array elements.
        System.out.println("\nSorted in Ascending order: ");
        display(arr);

        // Create an object of Descend class.
        DescendArray ds = new DescendArray();

        // Call sort() method to sort array elements in descending order.
        Arrays.sort(arr, ds); // for sorting into descending order.

        // Display the sorted array elements.
        System.out.println("\nSorted in Descending order: ");
        display(arr);
    }
    static void display(Integer arr[]){
        for(Integer element : arr){
            System.out.println(element + "\t");
        }
    }
}



// To sort elements into ascending order.
class AscendArray implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }
}

// To sort elements into descending order.
class DescendArray implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
        // For reverse comparison.
        return i2.compareTo(i1);
    }
}

