import java.io.File;
import java.io.IOException;
public class FileTester2 {
    public static void main(String[] args) throws IOException {
        // Create an object of File class and pass path of filename.
        File file = new File("./src/myfile.txt");

        // Use File class methods on File object.
        System.out.println("Does myfile.txt exist? " + file.exists());
        System.out.println("File name: " +file.getName());
        System.out.println("File size in bytes: " +file.length());

        System.out.println("Path: " +file.getPath());
        System.out.println("Absolute path: " +file.getAbsolutePath());
        System.out.println("Canonical path: " +file.getCanonicalPath());

        System.out.println("Parent: " +file.getParent());
        System.out.println("Free space: " +file.getFreeSpace());

        System.out.println("Is myfile.txt a file? " + file.isFile());
        System.out.println("Is myfile.txt a directory? " + file.isDirectory());
        System.out.println("Is myfile.txt hidden? " + file.isHidden());

        System.out.println("Can myfile.txt be read? " + file.canRead());
        System.out.println("Can myfile.txt be written? " + file.canWrite());

        System.out.println("Last modified on " +new java.util.Date(file.lastModified()));
    }
}

