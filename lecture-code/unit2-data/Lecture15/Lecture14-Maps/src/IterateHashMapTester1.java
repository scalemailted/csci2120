import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class IterateHashMapTester1 {
    public static void main(String[] args) {
        HashMap<Character, String> hmap = new HashMap<>(); // Creating a hash map.

        hmap.put('V', "Violet");
        hmap.put('I', "Indigo");
        hmap.put('B', "Blue");
        hmap.put('G', "Green");
        hmap.put('Y', "Yellow");
        hmap.put('O', "Orange");
        hmap.put('R', "Red");

        // entrySet is a method that is used to get view of entries of a hash map.
        Iterator<Entry<Character, String>> itr = hmap.entrySet().iterator();
        System.out.println("Iterating Entries of HashMap");
        while(itr.hasNext()) {
            Object key = itr.next();
            System.out.println(key);
        }
        // keySet is a method that is used to get view of keys of a hash map.
        Iterator<Character> itr2 = hmap.keySet().iterator();
        System.out.println("Iterating Keys of HashMap");
        while(itr2.hasNext()) {
            Object keyView = itr2.next();
            System.out.println(keyView);
        }
        // values is a method that is used to get values of keys of a hash map.
        Iterator<String> itr3 = hmap.values().iterator();
        System.out.println("Iterating Values of HashMap");
        while(itr3.hasNext()) {
            Object valuesView = itr3.next();
            System.out.println(valuesView);
        }
    }
}
