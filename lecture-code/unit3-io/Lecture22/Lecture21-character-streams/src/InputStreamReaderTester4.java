import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputStreamReaderTester4 {
    public static void main(String[] args) throws IOException {
        // Create an object of FileInputStream class and pass path of filename.
        FileInputStream fis = new FileInputStream("./src/myfile.txt");

        // Create an object of InputStreamReader class and pass reference variable fis to its constructor.
        InputStreamReader inStream = new InputStreamReader(fis);

        // Calling getEncoding() method to get the character encoding present in the stream.
        String encoding = inStream.getEncoding();
        System.out.println("Name of encoding used : " + encoding);

        System.out.println("Ready? : " + inStream.ready());
        recursiveRead(inStream);
        System.out.println("\nReady? : " + inStream.ready());

    }

    static boolean recursiveRead(InputStreamReader inStream) throws IOException{
        if (inStream.ready() == false){    //base case
            return false;
        }
        int byteVal = inStream.read();    //recursive case
        char ch = (char) byteVal;
        System.out.print(ch);
        return recursiveRead(inStream);
    }
}

