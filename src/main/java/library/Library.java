package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {


    private ArrayList<Book>  books;

    //TODO сделать мапу
    //private ArrayList<User> users;
    private Map<Integer, List<Log>> usersLogbook;


    public Library() {
        books = new ArrayList<>();
//        users = new ArrayList<>();
        usersLogbook = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' is added to the library");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            //books.remove(book);
            System.out.println("Book '" + book.getTitle() + "' is removed from the library");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not in the library yet");
        }

    }

    //TODO задавать ему айди и регистровать это в мапе
//    public void registerUser(User user){
//        if (users.contains(user)) {
//            System.out.println("There is already user with such name: " + user.getName());
//        } else {
//            users.add(user);
//        }
//    }

    private void setUserId() {

    }


    //TODO метод по поиску книги и удалению пользака
    //removeUser(User user)
    //findBook(String title) - возвращает книгу по названию и выводит сообщение о том, что книга найдена или нет






}
