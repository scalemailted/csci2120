import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUser {
    public static void main(String[] args) throws IOException {
        // Create an object of Person class.
        User u = new User();
        u.name = "Ted";
        u.age = 99;

        // Create File object.
        File file = new File("./src/userfile.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write or serialize objects to object output stream.
        oos.writeObject(u);
        oos.flush();
        System.out.println("Data has been written successfully...");
        // Print the output path of the file.
        System.out.println("Data are written to: " +file.getAbsolutePath());
    }
}
