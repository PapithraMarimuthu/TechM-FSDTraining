package io_streams;
import java.io.File;

public class CheckIfFileOrDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your path
        
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("It is a directory.");
            } else if (file.isFile()) {
                System.out.println("It is a file.");
            }
        } else {
            System.out.println("Path does not exist.");
        }
    }
}
