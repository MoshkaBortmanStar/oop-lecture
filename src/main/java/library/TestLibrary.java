package library;

public class TestLibrary {


    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java", "Mark O'Bryan", 1997, Genre.COMPUTER, true);
        library.addBook(book1);

        User user1 = new User("Misha");
        library.registerUser(user1);
        user1.borrowBook(book1, library);
        user1.returnBook(book1, library);

        library.showUsersLogbook();
    }

}
