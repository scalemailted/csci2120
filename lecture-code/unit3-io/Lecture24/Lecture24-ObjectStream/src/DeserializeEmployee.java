import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create an object of FileInputStream class to connect employeefile.dat file.
        FileInputStream fis = new FileInputStream("./src/employeefile.dat");

        // Create an object of ObjectInputStream to connect with fis.
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject(); // Reading objects.
        Employee e = (Employee)obj; // Converting to Employee.

        System.out.println(e);
    }
}
