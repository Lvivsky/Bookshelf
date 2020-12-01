package com.bookshelf.service;

import com.bookshelf.model.Genre;

import java.util.List;

public interface GenreService {

    void create(Genre genre);
    void remove(String id);

    List<Genre> findAll();

}
