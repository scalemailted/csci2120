import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
public class ReaderTester1 {
    public static void main(String[] args) throws IOException{
            // Create an object of Reader class and pass path of filename.
            Reader reader = new FileReader("./src/myfile.txt");

            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            System.out.println("\n");
            System.out.println("Does myfile.txt support mark operation: " +reader.markSupported());

            reader.close(); // Closing reader stream.
    }
}

