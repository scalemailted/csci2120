import java.util.HashMap;
public class IterateHashMapTester5 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("India", " Delhi");
        hmap.put("USA", " Washington, D.C.");
        hmap.put("Australia", " Canberra");
        hmap.put("New Zealand", " Wellington");
        hmap.put("Switzerland", " Bern");

        //Iteration over map using forEach() method.
        hmap.forEach((k,v) -> System.out.println("Country: "+ k + ", Capital: " + v));
    }
}

