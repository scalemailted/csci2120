import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamTester1 {
    public static void main(String[ ] args) throws IOException, ClassNotFoundException {

        // Create an file output stream for file objfile.txt.
        FileOutputStream fos = new FileOutputStream("./src/objfileout1.dat");

        // Create a buffered output stream and pass the reference fos to its constrcutor.
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // Create an ObjectOutputStream object and pass reference bos to its constructor.
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        // Write a string, int values, double value and object to the file.
        oos.writeUTF("Ted");
        oos.writeInt(10);
        oos.writeInt(484);
        oos.writeDouble(96.55);
        oos.writeObject(new java.util.Date());

        bos.flush();
        bos.close();
        oos.flush();
        oos.close();

        // Create an FileInputStream object for the objfile.txt.
        FileInputStream fis = new FileInputStream("./src/objfileout1.dat");

        // Create a buffered input stream and pass the reference fis to its constructor.
        BufferedInputStream bis = new BufferedInputStream(fis);

        // Create an InputStreamObject instance and pass object reference variable fis to its constructor.
        ObjectInputStream ois = new ObjectInputStream(bis);

        // Read a string, int values, double value and object to the file.
        String name = ois.readUTF();
        int rollNo = ois.readInt();
        int marksObt = ois.readInt();
        double per = ois.readDouble();
        Date date = (Date) ois.readObject();

        // Display data read on the console.
        System.out.printf("Name: %s, Roll#: %d, Total Marks: %d, Percentage: %.01f, Date: %s\n",
                name, rollNo, marksObt, per, date);

        bis.close();
        ois.close();
    }
}
