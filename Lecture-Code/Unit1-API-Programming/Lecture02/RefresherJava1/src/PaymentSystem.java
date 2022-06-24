public class PaymentSystem
{
    public static void main(String[] args)
    {
        Payable invoice1 = new Invoice(300, "Mops & Brooms","A34-6c");
        Payable kim = new SalaryEmployee("Kim", "Kimmie", new Date(9,9,1999), 5000);
        Payable jim = new HourlyEmployee("Jim", "Gymmie", new Date(12,12,2012), 15.00, 20);
        Payable tim = new HourlyEmployee("Tim", "Timm", new Date(14,1,2016), 25.00, 5);
        Payable ryan = new CommissionEmployee("Ryan", "Riann", new Date(31,10,2009), 0.25, 50000);
        
        Payable[] costlyThings = {invoice1, kim, jim, tim, ryan};
        
        double sum = 0;
        
        for (Payable i : costlyThings)
        {
            if (i instanceof Invoice)
            {
                Invoice invoice = (Invoice) i;
                System.out.println(i);
            }
            //System.out.println(i.getCost());
            sum += i.getCost();
        }
        System.out.printf("Total sum: $%.02f",sum);
        
       
        //System.out.println(invoice1);
        
        
    }
}