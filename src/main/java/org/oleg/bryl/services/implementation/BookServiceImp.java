package org.oleg.bryl.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.oleg.bryl.dao.Dao_Book;
import org.oleg.bryl.model.Book;
import org.oleg.bryl.services.BookService;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private Dao_Book dao_book;

    public List<Book> getBookList() {
        return dao_book.getBookList();
    }

    public Book getBookById(int id) {
        return dao_book.getBookById(id);
    }

    public void addBook(Book book) {
        dao_book.addBook(book);
    }

    public void editBook(Book book) {
        dao_book.editBook(book);
    }

    public void deleteBook(Book book) {
        dao_book.deleteBook(book);
    }
}
