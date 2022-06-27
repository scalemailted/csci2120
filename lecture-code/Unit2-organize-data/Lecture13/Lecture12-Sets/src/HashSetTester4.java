import java.util.HashSet;
import java.util.Set;
public class HashSetTester4 {
    public static void main(String[] args) {
        Set<String> pCountry = new HashSet<String>();

        // Check that HashSet is empty or not.
        System.out.println("Is popularCountries set empty? : " + pCountry.isEmpty());
        System.out.println("Number of countries in HashSet before adding: " +pCountry.size());
        pCountry.add("INDIA");
        pCountry.add("USA");
        pCountry.add("UK");
        pCountry.add("FRANCE");

        // Find size of HashSet.
        System.out.println("Number of countries in HashSet after adding: " + pCountry.size());
    }
}
