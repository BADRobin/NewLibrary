package org.oleg.bryl.dao.implementation;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.oleg.bryl.dao.Dao_Book;
import org.oleg.bryl.model.Book;

import java.util.List;


@Repository
@Transactional
public class DaoBookImp implements Dao_Book {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Book> getBookList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book");
        List<Book> list_books = query.list();
        session.flush();

        return list_books;
    }

    public Book getBookById(int book_id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = (Book) session.get(Book.class, book_id);
        session.flush();

        return book;
    }

    public void addBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
        session.flush();
    }

    public void editBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
        session.flush();
    }

    public void deleteBook(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(book);
        session.flush();
    }
}
