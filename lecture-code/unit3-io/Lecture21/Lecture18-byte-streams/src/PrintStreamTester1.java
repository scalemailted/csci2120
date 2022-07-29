import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
public class PrintStreamTester1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/outfile.txt");
        PrintStream ps = new PrintStream(fos);

        // Printing char value.
        ps.println('A');

        // Printing int value.
        ps.println(2000);

        // Printing string value.
        ps.println("I love Java Programming");

        // Printing current date.
        ps.println(new Date());

        ps.close();
        fos.close();
    }
}
