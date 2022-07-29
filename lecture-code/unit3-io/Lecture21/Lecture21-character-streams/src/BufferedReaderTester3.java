import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderTester3 {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;
        System.out.println("Enter a character:");

        int data = br.read();
        ch = (char)data;
        System.out.println("ASCII value is " +(int)ch);
    }
}

