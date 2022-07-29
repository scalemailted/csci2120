import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadFileTester1 {
    public static void main(String[] args) throws IOException{
            // Create a FileInputStream object to attach readfile1 to FileInputStream.
            FileInputStream fis = new FileInputStream("./src/readfile1.txt");

            // Create a BufferedInputStream object to wrap around FileInputStream.
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while ((i = bis.read()) != -1) {
                char ch = (char) i;
                System.out.print(ch);
            }
            bis.close();
            fis.close();
    }
}
