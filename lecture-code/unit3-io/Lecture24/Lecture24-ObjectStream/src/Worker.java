import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Worker implements Externalizable {
    String name;
    int id;
    double salary;

    Worker(){}
    Worker(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    @Override
    public void writeExternal(ObjectOutput outStream) throws IOException {
        // Serializing only id and salary.
        outStream.writeInt(id);
        outStream.writeDouble(salary);
    }
    @Override
    public void readExternal(ObjectInput inStream) throws ClassNotFoundException, IOException {
        // Order of reads must be the same as the order of writes.
        id = inStream.readInt();
        salary = inStream.readDouble();
    }
}
