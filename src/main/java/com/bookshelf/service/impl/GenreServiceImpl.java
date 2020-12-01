package com.bookshelf.service.impl;

import com.bookshelf.model.Genre;
import com.bookshelf.repository.GenreRepository;
import com.bookshelf.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository repository;

    @Autowired
    GenreServiceImpl(GenreRepository genreRepository) {
        this.repository = genreRepository;
    }

    @Override
    public void create(Genre genre) {
        repository.save(genre);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public List<Genre> findAll() {
        return repository.findAll();
    }
}
