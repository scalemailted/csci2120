//Imports from IO for object serialization & file processing
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class SerializeArray {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[ ] numbers = {10, 20, 30, 40, -50};
        String[ ] strings = {"John", "Ted", "Deep", "Kim"};

        // Create an output stream for file objfile.dat.
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/arrayfile.dat"));

        // Write arrays to the object output stream.
        oos.writeObject(numbers); // write serialized array to file.
        oos.writeObject(strings); // write serialized array to file.

        oos.flush(); // flushing object output stream.
        oos.close(); // closing object output stream.

        // Create an input stream for file objfile.dat.
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/arrayfile.dat"));

        int[ ] newNumbers = (int[])(ois.readObject()); // Reading array back from the file.
        String[ ] newStrings = (String[])(ois.readObject()); // Reading array back from the file.
        ois.close();

        // Display arrays contents.
        for (int i = 0; i < newNumbers.length; i++)
            System.out.print(newNumbers[i] + " "); // Displaying array contents.
        System.out.println();

        for (int i = 0; i < newStrings.length; i++)
            System.out.print(newStrings[i] + " "); // Displaying array contents.
    }
}

