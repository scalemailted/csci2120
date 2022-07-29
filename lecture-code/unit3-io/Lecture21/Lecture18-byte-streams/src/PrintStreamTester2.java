import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class PrintStreamTester2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/outfile.txt");
        PrintStream ps = new PrintStream(fos);

        // Printing char value.
        ps.print('S');

        // Printing int value.
        ps.print(5500);

        // Printing string value.
        ps.println("I love Java Programming");

        // Printing char value.
        ps.println('S');

        ps.close();
        fos.close();
    }
}
