import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileTester3 {
    public static void main(String[] args) throws IOException {
        // Create a random access file object.
        RandomAccessFile file = new RandomAccessFile("iofile.dat", "rw");

        // Clear the file to destroy the old data if exists.
        file.setLength(0); // Empty file.

        // Write new integer values to the file.
        for(int i = 0; i <= 10; i++) {
            file.writeInt(i);
        }
        // Print the current length of the file.
        System.out.println("Current length of file: " +file.length());

        // Get the first number from the file.
        // Bring the file pointer to the beginning.
        file.seek(0);
        System.out.println("First number: " +file.readInt());

        // Get the second number from the file.
        System.out.println("Second number: " +file.readInt());

        // Retrieve the number at 9th position.
        // Move the file pointer to 9th position.
        file.seek(9 * 4);
        System.out.println("Ninth number: " +file.readInt());

        // Modify the tenth number.
        file.writeInt(222);
        file.seek(10 * 4); // Moving pointer to 10th position.
        System.out.println("Tenth number: " +file.readInt());

        // Append a new number at the end of the file.
        file.seek(file.length());
        file.writeInt(333);
        // Print the new length of the file.
        System.out.println("New length of file: " +file.length());

        // Retrieve the new number. Move the file pointer to new number.
        file.seek(11 * 4);
        System.out.println("New number: "+file.readInt());
    }
}
