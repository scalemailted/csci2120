public class CommissionEmployee extends Employee
{
    double rate;
    double sales;
    
    public CommissionEmployee(String first, 
                          String last, 
                          Date hire, 
                          double rate, 
                          double sales)
    {
        super(first, last, hire);
        this.rate = rate;
        this.sales = sales;
    }
    
    public double getSales()
    {
        return this.sales;
    }
    
    public double getRate()
    {
        return this.rate;
    }
    
    //toString
    public String toString()
    {
        return String.format("%s %s, hired: %s, rate:%.02f, sales: $%.02f",
                            this.getFirstName(), 
                            this.getLastName(),
                            this.getHireDate(),
                            this.rate,
                            this.sales);
    }
    
    public double getEarnings()
    {
        return this.rate * this.sales;
    }
}