import java.io.FileWriter;
import java.io.IOException;
public class WriteFileTester1 {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter object to open the file.
        FileWriter fw = new FileWriter("./src/writefile1.txt");

        // To write text to the file, call write() method inherited from Writer class.
        fw.write("Welcome to UNO CSCI \n"); // Writing text to the file.
        fw.write("I love Java Programming");

        fw.close(); // Closing the file.
        System.out.println("Successfully written...");
    }
}
