package io_streams;
import java.io.File;
import java.io.FilenameFilter;

public class FilterFilesByExtension {
    public static void main(String[] args) {
        File directory = new File("C:\\Your\\Directory\\Path"); // your directory path
        String extension = ".txt"; // required extension
        
        if (directory.exists() && directory.isDirectory()) {
            FilenameFilter filter = (dir, name) -> name.endsWith(extension);
            String[] files = directory.list(filter);
            
            System.out.println("Files with " + extension + " extension:");
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
