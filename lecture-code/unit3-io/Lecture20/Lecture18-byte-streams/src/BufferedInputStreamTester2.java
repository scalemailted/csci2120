import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamTester2 {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object to attach myfile.txt
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            // Create a BufferedInputStream object to wrap FileInputStream.
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Call available() method to get the available number of bytes in bufferedInputStream.
            System.out.println("Available bytes at the beginning: " + bis.available());

            // Reads bytes from the file
            bis.read();
            bis.read();
            bis.read();

        // Get the available number of bytes at the end.
            System.out.println("Available bytes at the end: " + bis.available());
            bis.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
