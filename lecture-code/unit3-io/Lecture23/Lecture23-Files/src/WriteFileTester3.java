import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class WriteFileTester3 {
    public static void main(String[] args) throws IOException {
        // Create a string literal to assign the content of the file.
        String text = "Hello World\nHappy Learning!";

        // Defining the name of the file with location.
        Path fileName = Path.of("./src/writefile3.text");

        // Call writeString() method for writing the content into the file.
        Files.writeString(fileName, text);

        // Call readString() method for reading the content of the file.
        String fileContent = Files.readString(fileName);

        // Displaying the content inside the file.
        System.out.println(fileContent);
    }
}
