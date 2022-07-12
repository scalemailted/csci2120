import java.io.FileInputStream;
public class FileInputStreamTester3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/myfile.txt");

            int value = 0;
            while((value = fis.read())!=-1) {
                System.out.print((char)value);
            }
            fis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}