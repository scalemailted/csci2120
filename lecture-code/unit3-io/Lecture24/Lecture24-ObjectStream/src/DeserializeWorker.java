import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeWorker {
    public static void main(String[ ] args) throws IOException, ClassNotFoundException {
        File file = new File("./src/workerfile.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Deserializing or reading one object.
        Worker emp = new Worker();
        emp.readExternal(ois);

        // Displaying data (objects) that are read.
        System.out.println("Employee's id: " +emp.id);
        System.out.println("Employee's salary: " +emp.salary);

        // Print input path.
        System.out.println("Data read from " +file.getAbsolutePath());
        ois.close();
    }
}
