import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileTester2 {
    public static void main(String[] args) throws IOException {
        // Create a random access file object.
        RandomAccessFile file = new RandomAccessFile("cityfile.txt", "rw");

        file.seek(file.length()); // Moving file pointer to the end.
        file.writeBytes("New Orleans\n"); // Appending New Orleans.
        file.close();
        System.out.println("Successfully written...");
    }
}
