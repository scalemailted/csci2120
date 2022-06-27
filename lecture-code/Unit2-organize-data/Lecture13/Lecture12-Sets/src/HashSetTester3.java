import java.util.HashSet;
public class HashSetTester3 {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(5);
        hset.add(10);
        hset.add(15);
        hset.add(20);
        System.out.println("Initial list of elements");
        System.out.println(hset);

        // Removing a specific element from HashSet.
        hset.remove(10);
        System.out.println("List of elements after removing 10");
        System.out.println(hset);

        HashSet<Integer> hset2 = new HashSet<Integer>();
        hset2.add(10);
        hset2.add(25);
        hset.addAll(hset2);
        System.out.println("List of Elements after adding elements from existing collection");
        System.out.println(hset);

        // Removing all new elements from HashSet.
        hset.removeAll(hset2);
        System.out.println("List of Elements after removing elements from hset2");
        System.out.println(hset);

        // Removing all elements available in HashSet.
        hset.clear();
        System.out.println("After invoking clear() method: "+hset);
    }
}
