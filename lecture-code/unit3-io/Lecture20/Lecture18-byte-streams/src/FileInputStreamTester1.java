import java.io.FileInputStream;
public class FileInputStreamTester1 {
    public static void main(String[] args) {
        try {
            // Attach a file to FileInputStream for reading data and create an input stream for a file
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            // Reading a value from a file in the form of byte.
            int value = fis.read();
            System.out.println("Reading a value in byte form: " +value);

            // Converting byte into character to see text.
            System.out.print((char)value); // Displaying a single character on console.
            fis.close(); // Closing input stream automatically.
        } catch(Exception e){
            System.out.println(e);
        }
    }
}