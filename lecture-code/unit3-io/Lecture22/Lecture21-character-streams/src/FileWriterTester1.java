import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester1 {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter object to open the file.
        FileWriter fw = new FileWriter("./src/myfile.txt");

        // To write text to the file, call write() method inherited from Writer class.
        fw.write("Welcome to UNO Computer Science \n");
        fw.write("I love Java Programming");

        fw.close(); // Closing the file.
        System.out.println("Successfully written...");
    }
}