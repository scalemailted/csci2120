import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamTester1 {
    public static void main(String[] args) {
        try {
            // Store the filepath into the variable filepath of type String.
            String filepath = "./src/out1.txt";

            // Create FileOutputStream to attach file by using the filepath in its constructor.
            FileOutputStream fos = new FileOutputStream(filepath);
            fos.write(87);
            fos.close(); // Closing file.

            System.out.println("Successfully written");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
