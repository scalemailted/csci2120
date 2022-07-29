import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectInputStreamTester1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create an file output stream for file object.txt.
        FileOutputStream fos = new FileOutputStream("./src/objfilein1.dat");

        // Create an ObjectOutputStream object and pass reference fos to its constructor.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write a string, int values, double value and object to the file.
        oos.writeUTF("Ted");
        oos.writeInt(10);
        oos.writeInt(484);
        oos.writeDouble(96.55);
        oos.writeObject(new java.util.Date());


        // Create an FileInputStream object for the objfile.txt.
        FileInputStream fis = new FileInputStream("./src/objfilein1.dat");

        // Create an InputStreamObject instance and pass object reference variable fis to its constructor.
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Read a string, int values, double value and object to the file.
        String name = ois.readUTF();
        int rollNo = ois.readInt();
        int marksObt = ois.readInt();
        double per = ois.readDouble();
        Date date = (Date) ois.readObject(); // Casting into date.

        // Display data read on the console.
        System.out.printf("Name: %s, Roll#: %d, Total Marks: %d, Percentage: %.01f, Date: %s\n",
                            name, rollNo, marksObt, per, date);

        oos.close();
        ois.close();
    }
}
