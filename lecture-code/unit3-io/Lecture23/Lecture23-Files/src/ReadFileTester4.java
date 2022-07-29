import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ReadFileTester4 {
    public static List readFile(String fileName) {
        List lines = Collections.emptyList();
        try {
            // Read all lines and returns a list of string.
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {
        List list = readFile("./src/readfile4.txt");
        // Print each line using iterator() method.
        Iterator itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

