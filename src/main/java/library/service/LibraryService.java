package library.service;

import library.data.Book;

public interface LibraryService {
    void addBook(Book book);
    void removeBook(Book book);
    Book findBook(String title);
    boolean hasBook(Book book);
    void showBooks();
}
