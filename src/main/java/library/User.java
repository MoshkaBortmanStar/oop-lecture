package library;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class User {

    @Getter
    private String name;
    @Setter
    private int id;

    private ArrayList<Book> books;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }

        if (book.isAvailable()) {
            books.add(book);
            book.setAvailable(false);

            //TODO описать получше DONE
            System.out.println(name + " borrowed a book '" + book.getTitle() + "' from the library");

        } else {
            System.out.println(book.getTitle() + " This book: " + book.getTitle() + " is not available");
        }
    }

    //TODO Чудеса оптимизации от Александры (нужно ли проверять что книга есть?) DONE
    public void returnBook(Book book) {
        if (books.remove(book)) {
//            books.contains(book)
            book.setAvailable(true);
            System.out.println(this.name + " returned book: '" + book.getTitle() + "'");
        }
        else {
            System.out.println(this.name + " does not have this book: '" + book.getTitle() + "'");
        }
    }
}
