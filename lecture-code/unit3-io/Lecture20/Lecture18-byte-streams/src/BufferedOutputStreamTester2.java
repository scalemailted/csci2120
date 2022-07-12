import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutputStreamTester2 {
    public static void main(String[] args) throws IOException {
        String data = "Hello Java";
        // Create a FileOutputStream object to connect out_buff2.txt.
        FileOutputStream fos = new FileOutputStream("./src/out_buff2.txt");

        // Create a BufferedOutputStream object to wrap FileOutputStream in BufferedOutputStream.
        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

        bos.write(data.getBytes()); // Writing data to output stream.
        bos.flush(); // Flushing all data from internal buffer to destination file.
        bos.close();
        System.out.println("Successfully written...");
    }
}
