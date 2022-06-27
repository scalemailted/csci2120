public class SalaryEmployee extends Employee
{
    private double salary;
    
    //constructor
    public SalaryEmployee(String first, String last, Date hire, double salary)
    {
        super(first, last, hire);
        this.salary = salary;
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    //toString
    public String toString()
    {
        String employee = super.toString();
        return String.format("%s, salary:$%.02f",
                            employee,
                            this.salary);
    }
    
    public double getEarnings()
    {
        return this.salary / 2;
    }
}