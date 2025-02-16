package io_streams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file path
        
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] data = new byte[(int) file.length()];
                fis.read(data);
                System.out.println("File content (in bytes): " + new String(data));
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
