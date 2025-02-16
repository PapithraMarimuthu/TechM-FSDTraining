package io_streams;
import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file path
        
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("File size:");
            System.out.println(fileSize + " bytes");
            System.out.println((fileSize / 1024) + " KB");
            System.out.println((fileSize / (1024 * 1024)) + " MB");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
