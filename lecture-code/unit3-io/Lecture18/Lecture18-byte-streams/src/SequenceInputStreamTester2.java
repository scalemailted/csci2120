import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SequenceInputStreamTester2 {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream("./src/infile1.txt");
        FileInputStream file2 = new FileInputStream("./src/infile2.txt");

        // Concatenate file1 and file2 into file3.
        SequenceInputStream file3 = new SequenceInputStream(file1, file2);

        // Now create buffered input and output stream objects.
        BufferedInputStream bis = new BufferedInputStream(file3);
        BufferedOutputStream bos = new BufferedOutputStream(System.out);

        // Reading and writing until the end of buffers.
        int i;
        while( (i = bis.read()) != -1) {
            bos.write( (char) i );
        }
        bis.close();
        bos.close();
        file1.close();
        file2.close();
    }
}
