package io_streams;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadPlainTextFile {
    public static void main(String[] args) {
        File file = new File("C:\\Your\\Path\\file.txt"); // your file path
        
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
