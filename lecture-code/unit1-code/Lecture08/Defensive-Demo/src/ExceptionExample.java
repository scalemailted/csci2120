import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionExample
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        do{
            try
            {
                //Get numerator
                System.out.print("Enter numerator: ");
                int numerator = input.nextInt();

                //Get denominator
                System.out.print("Enter denominator: ");
                int denominator = input.nextInt();
                int result = numerator / denominator;
                System.out.printf("%d/%d = %d\n",
                        numerator,
                        denominator,
                        result);
                loop = false;
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Exception: You cannot divide by 0");
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Exception: input must an integer");
                input.nextLine();
            }

        }while(loop);
    }


}

