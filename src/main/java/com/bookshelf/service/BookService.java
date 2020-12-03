package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.model.Book;

import java.util.List;

public interface BookService {

    void save(Book book);
    void remove(String id);

    boolean isExistById(String id);

    Book findById(String id) throws EntityNotFoundException;

    List<Book> findAll();

    List<Book> findByTitle(String title);
    List<Book> findAllByAuthor(Account account);
    List<Book> findByGenre(String genreId);


}
