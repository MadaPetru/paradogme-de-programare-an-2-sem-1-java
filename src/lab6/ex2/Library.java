package lab6.ex2;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        if (books == null) books = new ArrayList<>();
        books.add(book);
    }

    public void delete(Book book) {
        if (books == null) return;
        books.remove(book);
    }
}
