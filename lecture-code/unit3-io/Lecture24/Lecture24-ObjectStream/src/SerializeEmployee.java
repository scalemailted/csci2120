import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {
    public static void main(String[ ] args) throws IOException {
        // Create an object of Employee class.
        Employee emp = new Employee("Ted", 12345, 300.00, new Date());

        // Create an object of FileOutputStream class to connect objfile.txt file.
        FileOutputStream fos = new FileOutputStream("./src/employeefile.dat");

        // Create an object of ObjectOutputStream class to connect with fos.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Call writeObject() method of ObjectOutputStream class.
        oos.writeObject(emp);
        oos.flush();
        oos.close();
        System.out.println("Serialization is done successfully...");
    }
}
