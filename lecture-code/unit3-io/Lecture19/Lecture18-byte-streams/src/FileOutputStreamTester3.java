import java.io.DataInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamTester3 {
    public static void main(String[] args) {
        try {
            // Create an object of DataInputStream to attach keyboard to DataInputStream.
            DataInputStream dis = new DataInputStream(System.in);

            // Store the filepath into the variable filepath of type String.
            String filepath = "./src/out3.txt";

            // Create FileOutputStream to attach file by using the filepath in its constructor.
            FileOutputStream fos = new FileOutputStream(filepath);
            System.out.println("Enter the text (@ at the end)");

            int value = 0;
            // Read the values (in byte form) from dis into ch and write them into fos.
            while((value = dis.read()) != '@'){
                char ch = (char)value; // Converting byte values into characters.
                fos.write(ch);
            }

            fos.close(); // Closing file.
            System.out.println("Successfully written...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
