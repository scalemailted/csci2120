import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class OutputStreamWriterTester2 {
    public static void main(String[] args) throws IOException {
        // Create FileOutputStream using filepath.
        FileOutputStream file = new FileOutputStream("./src/outputfile.txt");

        // Create OutputStreamWriter object with default encoding.
        OutputStreamWriter osw = new OutputStreamWriter(file);

        // Create OutputStreamWriter object with specified the encoding.
        OutputStreamWriter osw2 = new OutputStreamWriter(file, Charset.forName("UTF8"));

        // Return the name of character encoding used by output streams.
        System.out.println("Name of character encoding used by ows: " + osw.getEncoding());
        System.out.println("Name of character encoding used by ows2: " + osw2.getEncoding());

        // Closing the output stream writers.
        osw.close();
        osw2.close();
    }
}
