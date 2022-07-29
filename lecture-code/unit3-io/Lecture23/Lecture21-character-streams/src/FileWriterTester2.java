import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester2 {
    public static void main(String[ ] args) throws IOException {
        String strs[ ] = {
                "This is a dog",
                "This is a cat",
                "This is an elephant",
                "This is a lion"
        };

        // Create a FileWriter object to open file.
        FileWriter fw = new FileWriter("./src/myfile.txt");

        // To write an array of Strings to the file, call write() method inherited from Writer class.
        for(int i = 0; i < strs.length; i++) {
            fw.write(strs[i]); // write line to file
            fw.write("\n"); // output a newline
        }
        fw.close(); // Closing the file.
        System.out.println("Successfully written...");
    }
}
