import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderTester1 {
    public static void main(String[] args) throws IOException {
        String filepath = "./src/myfile.txt";

        // Create an object of FileReader and pass filepath to its constructor.
        FileReader fr = new FileReader(filepath);

        // Create an object of BufferedReader and pass FileReader fr to its constructor.
        BufferedReader br = new BufferedReader(fr);

        String lineOfText;
        // Read a line of text.
        while((lineOfText = br.readLine()) != null) {
            System.out.println(lineOfText);
        }
    }
}
