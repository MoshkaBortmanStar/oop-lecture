package library;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@ToString
public class User {

    @Getter
    private String name;
    @Setter
    @Getter
    private int id;

    private ArrayList<Book> books;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book, Library library) {
        if (books == null) {
            books = new ArrayList<>();
        }
        if (book.isAvailable() && library.hasBook(book)) {
            books.add(book);
            book.setAvailable(false);
            library.addBorrowToLogbook(book, this.id);
    //TODO описать получше DONE
            System.out.println(name + " borrowed a book '" + book.getTitle() + "' from the library");
        } else {
            System.out.println(book.getTitle() + " This book: " + book.getTitle() + " is not available");
        }
    }

    //TODO Чудеса оптимизации от Александры (нужно ли проверять что книга есть?) DONE
    public void returnBook(Book book, Library library) {
        if (books.remove(book)) {
            book.setAvailable(true);
            library.addReturnToLogbook(book, this.id);
            System.out.println(this.name + " returned book: '" + book.getTitle() + "'");
        }
        else {
            System.out.println(this.name + " does not have this book: '" + book.getTitle() + "'");
        }
    }
}
