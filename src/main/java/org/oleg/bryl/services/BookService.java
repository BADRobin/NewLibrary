package org.oleg.bryl.services;

import org.oleg.bryl.model.Book;

import java.util.List;


public interface BookService {

    List<Book> getBookList();

    Book getBookById(int id);

    void addBook(Book book);

    void editBook(Book book);

    void deleteBook(Book book);



}
