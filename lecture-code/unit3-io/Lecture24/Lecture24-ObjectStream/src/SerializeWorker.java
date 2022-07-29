import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeWorker {
    public static void main(String[ ] args) throws IOException {
        // Create an object of class Employee.
        Worker emp = new Worker("John", 124353, 200000.65 );

        File file = new File("./src/workerfile.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        emp.writeExternal(oos); // Externalizing employee.
        oos.flush();
        oos.close();
        System.out.println("An employee is externalized into workerfile.dat file.");

        // Display the serialized data on the Standard Output.
        System.out.println("Data written into file:");
        System.out.println("Employee's id: " +emp.id);
        System.out.println("Employee's salary: "+"Rs " +emp.salary);

        // Print output path.
        System.out.println("Data are written to " +file.getAbsolutePath());
    }
}
