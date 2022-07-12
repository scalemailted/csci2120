import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamTester3 {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object to attach myfile.txt
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            // Create a BufferedInputStream object to wrap FileInputStream.
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Skips 5 bytes from the buffered input stream.
            bis.skip(5);
            System.out.println("Input stream after skipping first 5 bytes:");

            // Reads all available bytes from buffered input stream after skipping.
            int i = 0;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            bis.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}