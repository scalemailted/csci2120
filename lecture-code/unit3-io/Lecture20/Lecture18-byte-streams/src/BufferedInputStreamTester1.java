import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamTester1 {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream object to attach myfile to FileInputStream.
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            // Create a BufferedInputStream object to wrap FileInputStream.
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i = 0;
            while ((i = bis.read()) != -1) {
                char ch = (char) i;
                System.out.print(ch);
            }
            bis.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
