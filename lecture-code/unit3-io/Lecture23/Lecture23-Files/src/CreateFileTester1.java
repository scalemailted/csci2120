import java.io.File;
import java.io.IOException;
public class CreateFileTester1 {
    public static void main(String[] args) {
        // Create an object of File class and pass the path of filename as argument.
        File file = new File("./src/file1.txt");
        boolean result;
        try {
            result = file.createNewFile(); // creates a new file
            // Check for the existence of a file whether successfully created.
            if(result) {
                System.out.println("File created at location: " +file.getCanonicalPath()); // returns the path string.
            }
            else  {
                System.out.println("File already exists at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e) {
            e.printStackTrace(); // It will print exception if any.
        }
    }
}
