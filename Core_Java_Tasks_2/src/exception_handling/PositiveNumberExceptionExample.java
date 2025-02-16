package exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumberExceptionExample {
    public static void checkNumbers(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new Exception("Positive number found: " + number);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            checkNumbers("C:\\Your\\Path\\numbers.txt"); // your file path
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
