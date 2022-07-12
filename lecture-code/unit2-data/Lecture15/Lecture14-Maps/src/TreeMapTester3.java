import java.util.TreeMap;
public class TreeMapTester3{
    public static void main(String[] args) {
        TreeMap<Character, String> tmap = new TreeMap<>();
        tmap.put('A', "Apple");
        tmap.put('P', "Parrot");
        tmap.put('C', "Cat");
        tmap.put('B', "Boy");
        tmap.put('D', "Dog");

        Object entrySet = tmap.entrySet();
        System.out.println("Entry set: " +entrySet);
        System.out.println("Key set: " +tmap.keySet());
        System.out.println("Value set: " +tmap.values());

        Object vGet = tmap.get('C');
        System.out.println("C: " +vGet);

        boolean containsKey = tmap.containsKey('B');
        System.out.println("Is key 'B' present in map: " +containsKey);

        boolean containsValue = tmap.containsValue("Apple");
        System.out.println("Is Apple present in map: " +containsValue);
    }
}
