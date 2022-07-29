import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a input file object.
        File file = new File("./src/userfile.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Deserialize or read objects of Person class.
        User u = (User)ois.readObject();

        // Displaying objects that are read from file.
        System.out.println("Name: " +u.name);
        System.out.println("Age: " +u.age);

        // Print the input path of the file.
        System.out.println("Data are read from " +file.getAbsolutePath());
    }
}
