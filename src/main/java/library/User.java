package library;

import java.util.ArrayList;

public class User {

    private String name;
    private int id;



    private ArrayList<Book> books;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void borrowBook(Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }

        if (book.isAvailable()) {
            books.add(book);
            book.setAvailable(false);

            //TODO описать получше
            System.out.println("Книга добавлена " + book.getTitle());

        } else {
            System.out.println(book.getTitle() + "Книга недоступна");
        }
    }

    //TODO Чудеса оптимизации от Александры (нужно ли проверять что книга есть?)
    public void returnBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            book.setAvailable(true);

            System.out.println(this.name + " Вернул книгу " + book.getTitle());
        }

        else {
            System.out.println(this.name + "Да я не брал эту книгу" + book.getTitle());
        }
    }

    public String getName() {
        return name;
    }

}
