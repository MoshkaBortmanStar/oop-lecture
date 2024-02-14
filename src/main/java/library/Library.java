package library;

import java.util.ArrayList;

public class Library {


    private ArrayList<Book>  books;

    //TODO сделать мапу
    private ArrayList<User> users;


    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();

    }



    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Книга добавлена в библиотеку " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Кинага удалена " + book.getTitle());
        } else {
            System.out.println("Книги нет у нас !!!");
        }

    }


    //TODO задавать ему айди и регистровать это в мапе
    public void registreUser(User user){
        if (users.contains(user)) {
            System.out.println("Пользователь уже есть с таким айди" + user.getName());

        } else {

            users.add(user);
        }

    }


    //TODO метод по поиску книги и удалению пользака
    //removeUser(User user)
    //findBook(String title) - возвращает книгу по названию и выводит сообщение о том, что книга найдена или нет






}
