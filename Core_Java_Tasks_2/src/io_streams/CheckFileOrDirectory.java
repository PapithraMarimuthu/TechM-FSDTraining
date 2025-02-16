package io_streams;
import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file/directory path
        
        if (file.exists()) {
            System.out.println("The file/directory exists.");
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }
}

