package Main;

public class LibraryManager extends LibrarySystem {
    private static final long serialVersionUID = 1L;

    @Override
    public void addBook(Book book) { books.add(book); }

    @Override
    public void addUser(User user) { users.add(user); }

    @Override
    public void borrowBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException {
        lock.lock();
        try {
            User user = findUser(userID);
            Book book = findBook(ISBN);
            if (book.isBorrowed()) {
                throw new MaxBooksAllowedException("Book is already borrowed.");
            }
            user.borrowBook(book);
            book.borrow();
            System.out.println("Book with ISBN " + ISBN + " has been borrowed successfully by " + user.getName() + " (" + userID + ")");
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void returnBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException {
        lock.lock();
        try {
            User user = findUser(userID);
            Book book = findBook(ISBN);
            user.returnBook(book);
            book.returnBook();
            System.out.println("Book with ISBN " + ISBN + " has been returned successfully by " + user.getName() + " (" + userID + ")");
        } finally {
            lock.unlock();
        }
    }


    @Override
    public void reserveBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException {
        System.out.println("Book with ISBN " + ISBN + " has been reserved by " + userID);
    }

    @Override
    public Book searchBook(String title) {
        return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

    private User findUser(String userID) throws UserNotFoundException {
        return users.stream().filter(u -> u.getUserID().equals(userID)).findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found."));
    }

    private Book findBook(String ISBN) throws BookNotFoundException {
        return books.stream().filter(b -> b.getISBN().equals(ISBN)).findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found."));
    }
}