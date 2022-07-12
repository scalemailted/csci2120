import java.io.FileOutputStream;
public class FileOutputStreamTester2 {
    public static void main(String[] args) {
        try {
            String filepath = "./src/out2.txt";
            FileOutputStream fos = new FileOutputStream(filepath);
            String str = "Welcome to UNO Computer Science!";

            byte[] bytearray = str.getBytes(); // Converting string into byte array.
            fos.write(bytearray);
            fos.close();

            System.out.println("Successfully written");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
