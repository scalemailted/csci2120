import java.io.IOException;
import java.io.InputStreamReader;
public class InputStreamReaderTester3 {
    public static void main(String[] args) throws IOException {
        // Create an InputStreamReader object using standard input stream.
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Enter a character:");
        char ch = (char) isr.read();
        System.out.println("Input Character: " +ch);
    }
}
