package library;

import library.data.Book;
import library.data.Genre;
import library.service.LibraryService;

public class Main {


    public static void main(String[] args) {
        LibraryService library = new Library();

        Book book1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", 2010, Genre.COMPUTER, true);
        Book book2 = new Book("Java for Dummies", "Barry A. Burd", 2017, Genre.COMPUTER, true);
        Book book3 = new Book("Spring in Action", "Craig Walls and Ryan Breidenbach", 2020, Genre.COMPUTER, true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.showBooks();
        library.removeBook(book2);
        library.showBooks();

        User user1 = new User("Misha");
        user1.borrowBook(book1, (Library) library);
        user1.returnBook(book1, (Library) library);
//        library.showUsersLogbook();
    }

}
