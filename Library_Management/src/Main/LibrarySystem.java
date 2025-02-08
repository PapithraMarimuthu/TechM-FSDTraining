package Main;
import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
abstract class LibrarySystem implements ILibrary, Serializable {
    protected final List<Book> books = new ArrayList<>();
    protected final List<User> users = new ArrayList<>();
    protected final ReentrantLock lock = new ReentrantLock();
    
    public abstract void addBook(Book book);
    public abstract void addUser(User user);
}