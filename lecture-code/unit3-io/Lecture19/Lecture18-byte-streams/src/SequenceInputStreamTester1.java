import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SequenceInputStreamTester1 {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream("./src/infile1.txt");
        FileInputStream file2 = new FileInputStream("./src/infile2.txt");

        // Concatenate file1 and file2 into file3.
        SequenceInputStream file3 = new SequenceInputStream(file1, file2);
        int i;
        while((i = file3.read()) != -1) {
            System.out.print((char)i);
        }
        file3.close();
        file2.close();
        file1.close();
    }
}
