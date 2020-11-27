package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Book;

import java.util.List;

public interface BookService {

    void save(Book book);
    void remove(String id);

    boolean isExistById(String id);

    Book findById(String id) throws EntityNotFoundException;

    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String authorId);
    List<Book> findByGenre(String genreId);


}
