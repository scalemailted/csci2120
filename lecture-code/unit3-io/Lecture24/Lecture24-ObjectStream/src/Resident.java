import java.io.Serializable;
public class Resident implements Serializable {
    String name;
    Address address; // Has-A relationship.
    public Resident(String name) {
        this.name = name;
    }
}
