package Main;
import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final String userID;
    private final List<Book> borrowedBooks;
    private static final int MAX_BOOKS = 3;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getUserID() { return userID; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) throws MaxBooksAllowedException {
        if (borrowedBooks.size() >= MAX_BOOKS) {
            throw new MaxBooksAllowedException("User has already borrowed maximum books.");
        }
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) { borrowedBooks.remove(book); }
}

