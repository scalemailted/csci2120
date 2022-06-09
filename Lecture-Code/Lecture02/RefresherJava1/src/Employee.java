public abstract class Employee implements Payable
{
    //attributes
    private String firstName;
    private String lastName;
    private Date hireDate;
    
    //constructor
    public Employee(String first, String last, Date hire)
    {
        this.firstName = first;
        this.lastName = last;
        this.hireDate = hire;
    }
    //getters
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public Date getHireDate()
    {
        return this.hireDate;
    }
    
    //toString
    public String toString()
    {
        return String.format("%s %s, hired: %s",
                            this.firstName, 
                            this.lastName,
                            this.hireDate);
    }
    
    public abstract double getEarnings();
    
    public double getCost()
    {
        return this.getEarnings();
    }
}