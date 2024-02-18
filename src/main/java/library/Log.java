package library;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Log {
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Log(Book book, LocalDate borrowDate) {
        this.book = book;
        this.borrowDate = borrowDate;
    }
}
