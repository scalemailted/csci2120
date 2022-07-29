import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterTester2 {
    public static void main(String[] args) throws IOException {
        String[] strs = {
                "New Delhi is the capital of India.",
                "Washington, D.C. is the capital of US.",
                "Canberra is the capital of Australia."
        };

        // Create an object of FileWriter class.
        FileWriter fw = new FileWriter("./src/myfile.txt");

        // Create an object of BufferedWriter class by passing fw to its constructor.
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i < strs.length; i++) {
            bw.write(strs[i]);
            bw.newLine();
        }
        bw.close(); // Closing the stream.
        System.out.println("File written successfully.");
    }
}
