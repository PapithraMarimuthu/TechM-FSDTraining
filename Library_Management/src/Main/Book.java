package Main;

import java.io.*;
import java.util.*;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String title;
	private final String author;
	private final String ISBN;
	private boolean isBorrowed;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isBorrowed = false;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void borrow() {
		this.isBorrowed = true;
	}

	public void returnBook() {
		this.isBorrowed = false;
	}
}
