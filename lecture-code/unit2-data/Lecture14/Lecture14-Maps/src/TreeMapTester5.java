import java.util.TreeMap;
public class TreeMapTester5{
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(25, "John");
        tmap.put(22, "Shubh");
        tmap.put(30, "Ricky");
        tmap.put(35, "Peter");
        tmap.put(18, "Johnson");
        System.out.println("Sorted tree map: " +tmap);

        // Use methods of NavigableMap interface.
        System.out.println("Descending order of tree map: " +tmap.descendingMap());
        // Returns entries whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+tmap.headMap(22,true));
        // Returns entries whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+tmap.tailMap(22,true));
        // Returns entries exists in between the specified key.
        System.out.println("subMap: "+tmap.subMap(18, false, 35, true));
        System.out.println("\n");

        // Use methods of SortedMap interface.
        // Returns entries whose keys are less than the specified key.
        System.out.println("headMap: "+tmap.headMap(40));
        // Returns entries whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+tmap.tailMap(22));
        // Returns entries exists in between the specified key.
        System.out.println("subMap: "+tmap.subMap(19, 25));
    }
}
