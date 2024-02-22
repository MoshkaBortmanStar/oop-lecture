package library.service.cashService.impl;

import library.User;
import library.data.Book;
import library.data.Log;
import library.service.cashService.LogbookCashService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogbookCash implements LogbookCashService {
    private static Map<User, List<Log>> USERS_LOGBOOK = new HashMap<>();
    private static int USERS_COUNT = 1;

    private static LogbookCash INSTANCE = null;
    private LogbookCash() {
    }
    public static LogbookCash GET_INSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new LogbookCash();
        }
        return INSTANCE;
    }
    @Override
    public void addBorrowToLogbook(Book book, User user) {
        for (User u : USERS_LOGBOOK.keySet()) {
            if (u.equals(user)) {
                USERS_LOGBOOK.get(u).add(new Log(book, LocalDate.now()));
            }
        }
    }

    @Override
    public void addReturnToLogbook(Book book, User user) {
        for (User u : USERS_LOGBOOK.keySet()) {
            if (u.equals(user)) {
                for (Log log : USERS_LOGBOOK.get(u)) {
                    if (log.getBook().equals(book)) {
                        log.setReturnDate(LocalDate.now());
                    }
                }
            }
        }
    }

    @Override
    public void showLogbook() {
        USERS_LOGBOOK.entrySet().forEach(System.out::println);
    }

    @Override
    public void registerUser(User user) {
        if (!USERS_LOGBOOK.containsKey(user)) {
            user.setId(USERS_COUNT++);
            USERS_LOGBOOK.put(user, new ArrayList<>());
            System.out.println("User: " + user.getName() + " successfully registered in the library");
        }
    }

    @Override
    public void removeUser(User user) {
        if (USERS_LOGBOOK.containsKey(user)) {
            USERS_LOGBOOK.remove(user);
            System.out.println("User: " + user.getName() + " was removed from the library");
        } else {
            System.out.println("User: " + user.getName() + " is not registered in the library");
        }
    }


}
