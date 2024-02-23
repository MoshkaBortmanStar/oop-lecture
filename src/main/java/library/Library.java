package library;

import library.data.Book;
import library.service.LibraryService;
import library.service.cashService.impl.LogbookCash;

import java.util.ArrayList;

public class Library implements LibraryService {
    private ArrayList<Book>  books;
    LogbookCash logbookCash = LogbookCash.GET_INSTANCE();

    public Library() {
        books = new ArrayList<>();
    }
    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' is added to the library");
    }
    @Override
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' is removed from the library");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not in the library yet");
        }
    }
    @Override
    public Book findBook(String title) {
        if (books.isEmpty()) {
            System.out.println("There is no books in the library");
            return null;
        }
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("The book: '" + title + "' is found!");
                return book;
            }
        }
        System.out.println("The book: '" + title + "' is not found!");
        return null;
    }
    @Override
    public boolean hasBook(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void showBooks() {
        int counter = 1;
        for (Book book : books) {
            System.out.println("Book # " + counter + " '" + book.getTitle() + "'" + " - author: " + book.getAuthor());
            counter++;
        }
    }
}
