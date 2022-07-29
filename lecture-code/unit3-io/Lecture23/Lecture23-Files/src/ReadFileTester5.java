import java.nio.file.Files;
import java.nio.file.Paths;
public class ReadFileTester5 {
    public static String readFile(String fileName)throws Exception {
        String fileContents = "";
        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        fileContents = new String(bytes);
        return fileContents;
    }

    public static void main(String[] args) throws Exception {
        String fileContents = readFile("./src/readfile5.txt");
        System.out.println(fileContents);
    }
}
