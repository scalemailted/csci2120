import java.util.LinkedHashSet;
public class LinkedHashSetTester5 {
    public static void main(String[] args)
    {
        LinkedHashSet<Person> lhset = new LinkedHashSet<>();

        // Creating objects of Students.
        Person st1 = new Person("John", 2345, "New York");
        Person st2 = new Person("Deep", 1234, "Dhanbad");
        Person st3 = new Person("Ricky", 7583, "Cape Town");

        // Adding elements (object references) into LinkedHashSet.
        lhset.add(st1);
        lhset.add(st2);
        lhset.add(st3);

        // Traversing linked hash set.
        for(Person s:lhset){
            System.out.println("Name: " +s.name+" "+ "Id: " +s.id+" "+"City: "+s.city);
        }
    }
}

class Person {
    String name;
    int id;
    String city;

    Person(String name, int id, String city){
        this.name = name;
        this.id = id;
        this.city = city;
    }
}
