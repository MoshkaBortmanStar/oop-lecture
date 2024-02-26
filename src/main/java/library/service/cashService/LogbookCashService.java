package library.service.cashService;

import library.User;
import library.data.Book;

public interface LogbookCashService {
    void addBorrowToLogbook(Book book, User user);
    void addReturnToLogbook(Book book, User user);
    void showLogbook();
    void registerUser(User user);
    void removeUser(User user);
}
