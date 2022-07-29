import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataInputStreamTester1 {
    public static void main(String[] args) throws IOException {
        String filepath = "./src/mydata.dat";
        // Create a FileOutputStream object to connect with mydata.dat file.
        FileOutputStream fos = new FileOutputStream(filepath);

        // Create a DataOutputStream object to wrap on fos.
        DataOutputStream dos = new DataOutputStream(fos);

        // Write following primitive data to the "mydata.dat" file.
        dos.writeUTF("Welcome to Java world");
        dos.writeInt(1246);
        dos.writeDouble(125.25);
        dos.writeBoolean(true);
        dos.writeChar('S');

        dos.close();
        fos.close();

        // Reading data from the "myfileout.dat" file.
        FileInputStream fis = new FileInputStream(filepath);
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());

        dis.close();
        fis.close();
    }
}
