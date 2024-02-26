package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private ArrayList<Book>  books;

    //TODO сделать мапу DONE
    private Map<User, List<Log>> usersLogbook;
    private int USERS_COUNT = 0;

    public Library() {
        books = new ArrayList<>();
        usersLogbook = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' is added to the library");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book '" + book.getTitle() + "' is removed from the library");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not in the library yet");
        }
    }

    //TODO задавать ему айди и регистрировать это в мапе DONE
    public void registerUser(User user){
        if (!usersLogbook.containsKey(user)) {
            user.setId(++USERS_COUNT);
            usersLogbook.put(user, new ArrayList<Log>());
            System.out.println("User: " + user.getName() + " successfully registered in the library");
        }
    }
    //TODO метод по удалению пользака DONE
    public void removeUser(User user) {
        if (usersLogbook.containsKey(user)) {
            usersLogbook.remove(user);
            System.out.println("User: " + user.getName() + " was removed from the library");
        } else {
            System.out.println("User: " + user.getName() + " is not registered in the library");
        }
    }
    //TODO возвращает книгу по названию и выводит сообщение о том, что книга найдена или нет DONE
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

    public boolean hasBook(Book book) {
        for (Book b : books) {
            if (b.equals(book)) {
                return true;
            }
        }
        return false;
    }

    public void addBorrowToLogbook(Book book, int userId) {
        for (User u : usersLogbook.keySet()) {
            if (u.getId() == userId) {
                usersLogbook.get(u).add(new Log(book, LocalDate.now()));
            }
        }
    }

    public void addReturnToLogbook(Book book, int userId) {
        for (User u : usersLogbook.keySet()) {
            if (u.getId() == userId) {
                for (Log log : usersLogbook.get(u)) {
                    if (log.getBook().equals(book)) {
                        log.setReturnDate(LocalDate.now());
                    }
                }
            }
        }
    }

    public void showUsersLogbook() {
        for (Map.Entry<User, List<Log>> userListEntry : usersLogbook.entrySet()) {
            System.out.println(userListEntry);
        }
    }
}
