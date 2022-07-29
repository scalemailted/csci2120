import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class CreateFileTester3 {
    public static void main(String[] args) {
        // Creating Path instance.
        Path path = Paths.get("./src/file3.txt");
        try {
            Path p = Files.createFile(path); // creating a file at specified location.
            System.out.println("File created successfully at location: " +p);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

