import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    String name;
    int id;
    double salary;
    Date doj;

    Employee(String name, int id, double salary, Date doj) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.doj = doj;
    }

    public String toString(){
        return String.format("Name:%s, id:%d, salary:$%f, hired:(%s)",name,id,salary,doj);
    }
}



