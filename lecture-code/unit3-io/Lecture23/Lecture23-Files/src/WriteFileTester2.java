import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteFileTester2 {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter object to open the file.
        FileWriter fw = new FileWriter("./src/writefile2.txt");

        // Create a Scanner class object to take input from the keyboard.
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your content: ");
        String str = sc.nextLine();

        // To write text to the file, call write() method inherited from Writer class.
        fw.write(str); // Writing text to the file.

        fw.close(); // Closing the file.
        System.out.println("Successfully written...");
    }
}
