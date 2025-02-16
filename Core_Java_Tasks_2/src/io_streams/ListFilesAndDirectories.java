package io_streams;
import java.io.File;

public class ListFilesAndDirectories {
    public static void main(String[] args) {
        File directory = new File("C:\\Your\\Directory\\Path"); // Change to your directory path
        
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            System.out.println("Files and Directories in " + directory.getAbsolutePath() + ":");
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
