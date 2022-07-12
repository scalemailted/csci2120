import java.util.ArrayList;
import java.util.Collections;
public class ComparableTester1 {
    public static void main(String[] args) {
        // Creates objects of Student class and passes the parameters to their constructors.
        Student st1 = new Student("John", 20, 15);
        Student st2 = new Student("Peter", 15, 16);
        Student st3 = new Student("Deep", 25, 15);

        // Create an object of ArrayList of type Student.
        ArrayList<Student> al = new ArrayList<>();

        // Adds elements (references) to the array list.
        al.add(st1);
        al.add(st2);
        al.add(st3);

        // Display name of students, sorted by rollnos.
        System.out.println("Displaying student's name sorted by rollnos:");
        Collections.sort(al); // This method is used to sort elements of list.
        for(Student st:al){
            System.out.println(st.name+" "+st.rollno+" "+st.age);
        }
    }
}

class Student implements Comparable<Student> {
    // Declaration of variables.
    String name;
    int rollno;
    int age;

    Student(String name, int rollno,int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    // Compare two students based on their roll numbers.

    @Override// Implementing the compareTo method defined in Comparable interface.
    public int compareTo(Student st) {
    // Logic for sorting elements in ascending order.
        if(rollno == st.rollno)
            return 0;
        else if(rollno > st.rollno)
            return 1;
        else
            return -1;
    }
}
