public class Invoice implements Payable
{
    //attributes
    private double totalCost;
    private String id;
    private String name;
    
    public Invoice(double cost, String name, String id)
    {
        if (cost < 0)
        {
            throw new IllegalArgumentException("cost must be >0");
        }
        this.totalCost = cost;
        this.name = name;
        this.id = id;
    }
    
    public double getCost()
    {
        return this.totalCost;
    }
    
    public String toString()
    {
        return String.format("Invoice# %s\n%s\n$%.02f",
                              this.id,
                              this.name,
                              this.totalCost);
    }
}