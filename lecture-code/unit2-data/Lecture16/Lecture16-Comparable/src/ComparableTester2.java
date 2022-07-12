import java.util.ArrayList;
import java.util.Collections;
public class ComparableTester2 {
    public static void main(String[] args) {
        // Creates objects of Person class and passes the parameters to their constructors.
        Person p1 = new Person("John", 20, 15);
        Person p2 = new Person("Peter", 15, 16);
        Person p3 = new Person("Deep", 25, 15);

        // Create an object of ArrayList of type Person.
        ArrayList<Person> al = new ArrayList<>();

        // Adds elements (references) to the array list.
        al.add(p1);
        al.add(p2);
        al.add(p3);

        // Display name of person, sorted by rollnos.
        System.out.println("Displaying person's name sorted by rollnos:");
        Collections.sort(al); // This method is used to sort elements of list.
        for(Person p : al){
            System.out.println(p.name+" "+p.rollno+" "+p.age);
        }
    }
}

class Person implements Comparable<Person> {
    // Declaration of variables.
    String name;
    int rollno;
    int age;

    Person(String name, int rollno,int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    // Compare two persons based on their roll numbers.

    @Override// Implementing the compareTo method defined in Comparable interface.
    public int compareTo(Person p) {
        // Logic for sorting elements in ascending order.
        if(rollno == p.rollno)
            return 0;
        else if(rollno < p.rollno)
            return 1;
        else
            return -1;
    }
}


