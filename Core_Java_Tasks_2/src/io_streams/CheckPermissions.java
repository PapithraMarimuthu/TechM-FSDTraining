package io_streams;
import java.io.File;

public class CheckPermissions {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file path
        
        if (file.exists()) {
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
