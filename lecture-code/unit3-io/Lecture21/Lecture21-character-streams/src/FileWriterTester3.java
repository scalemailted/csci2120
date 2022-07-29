import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester3 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/input.txt");
        File outFile = new File("./src/output.txt");

        FileReader fr = new FileReader(inFile);
        FileWriter fw = new FileWriter(outFile);

        // Read and write till the end.
        int ch;
        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}


