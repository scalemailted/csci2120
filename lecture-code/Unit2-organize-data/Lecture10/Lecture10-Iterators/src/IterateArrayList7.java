import java.util.ArrayList;
import java.util.ListIterator;
public class IterateArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i <= 9 ; i++) {
            al.add(i);
        }
        System.out.println(al);
        ListIterator<Integer> litr = al.listIterator(4); // Iterating through a specific element '4'.
        while(litr.hasNext()) {
            Integer it = litr.next();
            System.out.println(it);
        }
        while(litr.hasPrevious()) {
            al.add(20); // It will throw ConcurrentModificationException because we can not add element in the ArrayList during Iteration.
            Integer it1 = litr.next();
            System.out.println(it1);
        }
    }
}

