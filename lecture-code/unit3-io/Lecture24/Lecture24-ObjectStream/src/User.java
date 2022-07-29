import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// A User class that implements Externalizable interface.
public class User implements Externalizable {
    String name;
    int age;

    @Override
    public void writeExternal(ObjectOutput outStream) throws IOException {
        // Writing name and age to the stream.
        outStream.writeObject(name);
        outStream.writeInt(age);
    }
    @Override
    public void readExternal(ObjectInput inStream) throws ClassNotFoundException, IOException {
        // Reading name and age in the same order in which they were written.
        name = (String)inStream.readObject();
        age = inStream.readInt();
    }
}
