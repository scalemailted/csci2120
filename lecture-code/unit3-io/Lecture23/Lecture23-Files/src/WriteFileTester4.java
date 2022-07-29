import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFileTester4 {
    public static void main(String[] args) throws IOException {
        // Create an object of FileWriter class.
        FileWriter fw = new FileWriter("./src/writefile4.txt");

        // Create an object of BufferedWriter class and reference variable fw to its constructor.
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This is an apple");
        bw.newLine(); // For line separator.
        bw.write("This is an orange");
        bw.flush(); // flushing the buffer.
        bw.close(); // Closing the stream.
        System.out.println("File written successfully.");
    }
}