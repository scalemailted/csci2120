import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadFileTester3 {
    public static void main(String[] args) throws IOException {
        // Create an object of File class.
        File file = new File("./src/readfile3.txt");
        // Create an object of Scanner class for the file.
        Scanner sc = new Scanner(file);

        // Reading data from the file.
        while (sc.hasNext()) {
            String firstName = sc.next();
            String mName = sc.next();
            String lastName = sc.next();

            int age = sc.nextInt();
            System.out.println(firstName + " " + mName + " " + lastName + " " + age);
        }
        // Close the file
        sc.close();
    }
}
