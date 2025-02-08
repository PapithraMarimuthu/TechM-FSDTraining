package Main;
import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
public class Main {
    private static final String FILE_NAME = "libraryData.ser";
    
    public static void main(String[] args) {
        LibraryManager libManager = loadLibraryData();
        
        // Sample Data
        libManager.addBook(new Book("Java Programming", "Papithra", "12345"));
        libManager.addBook(new Book("Data Structures", "Archanna", "67890"));
        libManager.addUser(new User("Sowmya", "U001"));
        libManager.addUser(new User("Sanjeevini", "U002"));
        
        // Demonstration of borrowing and returning books
        try {
            libManager.borrowBook("12345", "U001");
            libManager.returnBook("12345", "U001");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        saveLibraryData(libManager);
    }

    private static void saveLibraryData(LibraryManager libManager) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(libManager);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LibraryManager loadLibraryData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (LibraryManager) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new LibraryManager();
        }
    }
}
