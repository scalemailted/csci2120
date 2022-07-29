import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputStreamReaderTester1 {
    public static void main(String[] args) throws IOException {
        // Create an object of FileInputStream class and pass path of filename.
        FileInputStream fis = new FileInputStream("./src/myfile.txt");

        // Create an object of InputStreamReader class and pass reference variable fis to its constructor.
        InputStreamReader inStream = new InputStreamReader(fis);

        int data = inStream.read(); // Calling to read() method.
        while (data != -1) {
            System.out.print((char) data);
            data = inStream.read();
        }
        inStream.close();
    }
}
