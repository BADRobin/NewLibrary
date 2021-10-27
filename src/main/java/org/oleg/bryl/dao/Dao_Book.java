package org.oleg.bryl.dao;

import org.oleg.bryl.model.Book;

import java.util.List;


public interface Dao_Book {

    List<Book> getBookList();

    Book getBookById(int book_id);

    void addBook(Book book);

    void editBook(Book book);

    void deleteBook(Book book);
}
