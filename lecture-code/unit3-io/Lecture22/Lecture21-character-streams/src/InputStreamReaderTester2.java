import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputStreamReaderTester2 {
    public static void main(String[] args) throws IOException {
        // Create an object of FileInputStream class and pass path of filename.
        FileInputStream fis = new FileInputStream("./src/myfile.txt");

        // Create an object of InputStreamReader class and pass reference variable fis to its constructor.
        InputStreamReader inStream = new InputStreamReader(fis);

        // Calling getEncoding() method to get the character encoding present in the stream.
        String encoding = inStream.getEncoding();
        System.out.println("Name of encoding used : " + encoding);

        System.out.println("Ready? : " + inStream.ready());
        while (inStream.ready()) {
            int byteVal = inStream.read();
            char ch = (char) byteVal;
            System.out.print(ch);
        }
        System.out.println("\nReady? : " + inStream.ready());

    }
}
