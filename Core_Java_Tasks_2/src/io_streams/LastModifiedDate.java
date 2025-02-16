package io_streams;
import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file path
        
        if (file.exists()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(file.lastModified()));
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
