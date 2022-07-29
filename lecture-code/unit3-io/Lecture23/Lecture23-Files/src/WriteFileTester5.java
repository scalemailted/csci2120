import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFileTester5 {
    public static void main(String[] args) throws IOException {
        try {
            // Store the filepath into a variable filepath of type String.
            String filepath = "./src/writefile5.txt";

            // Create FileOutputStream object to attach file with FileOutputStream and pass filepath to its constructor.
            FileOutputStream fos = new FileOutputStream(filepath);

            String str = "Welcome to Java!";
            byte bytearray[ ] = str.getBytes(); // Converting string into byte array.
            fos.write(bytearray);
            fos.close(); // Closing file.
            System.out.println("Successfully written...");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}

