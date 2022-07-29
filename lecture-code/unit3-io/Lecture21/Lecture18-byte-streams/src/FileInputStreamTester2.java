import java.io.FileInputStream;
public class FileInputStreamTester2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            // Reading all byte values from a file and display on the console.
            int value = 0;
            while((value = fis.read())!=-1) {
                System.out.print(value + " ");
            }
            fis.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}