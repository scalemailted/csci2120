import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTester1 {
    public static void main(String [] args) {
        try {
            Writer w = new FileWriter("./src/outputfile.txt");
            String data = "Hello World.";
            w.write(data);
            w.close();

            System.out.println("Successfully written...");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

