package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Book;
import com.bookshelf.repository.BookRepository;
import com.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    BookServiceImpl(@Autowired BookRepository bookRepository) {
        this.repository = bookRepository;
    }

    @Override
    public void save(Book book) {
        repository.save(book);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public boolean isExistById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Book findById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return repository.findAllByTitle(title);
    }

    @Override
    public List<Book> findByAuthor(String authorId) {
        return repository.findAllByAccountId(authorId);
    }

    @Override
    public List<Book> findByGenre(String genreId) {
        return repository.findAllByGenreList(genreId);
    }
}
