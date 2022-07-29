import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
public class CreateFileTester2 {
    public static void main(String[] args) throws IOException{
        // Creating an object of Scanner class.
        Scanner sc = new Scanner(System.in);
        // Store the filepath into the variable filepath of type String.
        String filepath = "./src/file2.txt";

        // Create FileOutputStream object pass name and true as arguments to constructor.
        FileOutputStream fos = new FileOutputStream(filepath, true);  // true for append mode.
        System.out.print("Enter your file content: ");
        String s = sc.nextLine()+"\n"; // Variable s stores the string which we have entered

        // Converts string into bytes using getBytes() method.
        byte[] b = s.getBytes();
        fos.write(b); // writing bytes into file.
        fos.close();  // closing the file.
        System.out.println("file saved successfully.");
    }
}

