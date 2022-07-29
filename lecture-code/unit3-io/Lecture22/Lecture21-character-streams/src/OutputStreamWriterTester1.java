import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriterTester1 {
    public static void main(String[] args) throws IOException {
        String data = "I love Java Programming.";

        // Create FileOutputStream using filepath
        FileOutputStream file = new FileOutputStream("./src/outputfile.txt");

        // Create OutputStreamWriter by passing file to its constructor.
        OutputStreamWriter osw = new OutputStreamWriter(file);

        // Write string to the file.
        osw.write(data);

        // Close the writer.
        osw.close();
        System.out.println("Successfully written...");
    }
}
