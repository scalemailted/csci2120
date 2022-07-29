import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamTester4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/myfile.txt");
            FileOutputStream fos = new FileOutputStream("./src/out4.txt");

            int i = 0;
            while ((i = fis.read()) != -1){
                char ch = (char)i;
                fos.write(ch);
            }
            fis.close();
            System.out.println("Successfully written...");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
