package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmptyFileException {
    public static void checkEmptyFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        try (Scanner scanner = new Scanner(file)) {
            if (!scanner.hasNextLine()) {
                throw new Exception("File is empty!");
            }
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        try {
            checkEmptyFile("C:\\Your\\Path\\file.txt"); // your file path
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
