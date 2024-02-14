package library;

public class TestLibr {


    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java", "Марк о Браян", 1997, Genre.COMPUTER, true);
        library.addBook(book1);

        User user1 = new User("Misha");
        user1.borrowBook(book1);
        user1.returnBook(book1);
        user1.returnBook(book1);

    }

}
