package library.service;

import library.Library;
import library.data.Book;

public interface UserService {
    void borrowBook(Book book, Library library);
    void returnBook(Book book, Library library);
}
