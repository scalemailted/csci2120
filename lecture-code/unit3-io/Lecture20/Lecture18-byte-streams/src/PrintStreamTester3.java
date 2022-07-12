public class PrintStreamTester3 {
    public static void main(String[] args) {
        System.out.println("Displaying some numeric values " + "in different formats.\n");

        System.out.printf("Displaying integer values in various formats: ");
        System.out.printf("%d %(d %+d %05d\n", 5, -5, 5, 5);

        System.out.println();

        System.out.printf("Default floating-point format: %f\n", 9999999.99);
        System.out.printf("Floating-point with commas: %,f\n", 9999999.99);

        System.out.printf("Negative floating-point default: %,f\n", -9999999.99);
        System.out.printf("Negative floating-point option: %,(.02f\n", -9999999.99);
    }
}
