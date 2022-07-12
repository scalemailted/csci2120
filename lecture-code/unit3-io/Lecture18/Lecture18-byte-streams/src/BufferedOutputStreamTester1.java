import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferedOutputStreamTester1 {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream object to connect out_buff1.
            FileOutputStream fos = new FileOutputStream("./src/out_buff1.txt");

            // Create a BufferedOutputStream object to wrap FileOutputStream.
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String s="Welcome to UNO Computer Science";
            byte[] b = s.getBytes(); // Converting String into array bytes.
            bos.write(b); // Write data to the output stream.
            bos.close(); // Closing output stream.

            System.out.println("Successfully written...");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
