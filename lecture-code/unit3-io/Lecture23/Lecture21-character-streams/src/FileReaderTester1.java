import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester1 {
    public static void main(String [] args) throws IOException {
        try {
            // Create a FileReader object with file path.
            FileReader fr = new FileReader("./src/myfile.txt");

            int i;  //return type of read() method is int.
            // Read characters at a time,
            while((i = fr.read()) != -1) {
                System.out.print((char) i); // Converting int into char.
            }
            System.out.println("");
            fr.close(); // Closing file reader.

        } catch (FileNotFoundException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}



