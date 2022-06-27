import java.util.HashSet;
import java.util.Set;
public class IterateSet5 {
    public static void main(String[] args) {
        Set<Character> s = new HashSet<Character>();
        s.add('A');
        s.add('B');
        s.add('C');
        s.add('D');
        s.add('E');
        System.out.println(s);

        System.out.println("Iterating using forEach loop with method reference");
        s.forEach(System.out::println);

        System.out.println("Iterating using forEach loop with lambda expression");
        s.forEach( i -> System.out.println(i) );
    }
}
