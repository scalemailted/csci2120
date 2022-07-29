import java.io.File;
public class FileTester1 {
    public static void main(String[] args) {
        // Create an object of File class and pass the path of filename.
        File file1 = new File("./src/myfile.txt");
        File file2 = new File("myfile.txt");

        // Check for the existence of file.
        System.out.println("file1 exists? " + file1.exists() );
        System.out.println("file2 exists? " + file2.exists() );
    }
}
