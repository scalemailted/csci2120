public class HourlyEmployee extends Employee
{
    double hourlyRate;
    double hoursWorked;
    
    public HourlyEmployee(String first, 
                          String last, 
                          Date hire, 
                          double rate, 
                          double hours)
    {
        super(first, last, hire);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }
    
    public double getHours()
    {
        return this.hoursWorked;
    }
    
    public double getRate()
    {
        return this.hourlyRate;
    }
    
    //toString
    public String toString()
    {
        return String.format("%s %s, hired: %s, hourly rate:$%.02f, worked: %.02f",
                            this.getFirstName(), 
                            this.getLastName(),
                            this.getHireDate(),
                            this.hourlyRate,
                            this.hoursWorked);
    }
    
    public double getEarnings()
    {
        return this.hourlyRate * this.hoursWorked;
    }
}