import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTester1 {
    public static void main(String[] args) throws IOException {
        // Data to write on Console using PrintWriter class.
        // Create an object of PrintWriter class using System.out.
        PrintWriter pw = new PrintWriter(System.out);

        pw.write("Hello from the console.");
        pw.flush();
        pw.close();

        // Data to write in File using PrintWriter class.
        PrintWriter pw2 = new PrintWriter(new FileWriter("./src/myfile.txt"));
        pw2.write("Hello from a file.");
        pw2.flush();
        pw2.close();
    }
}
