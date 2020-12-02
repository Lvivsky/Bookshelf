package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.model.container.PhotoContainer;

public interface PhotoContainerService {

    void add(PhotoContainer file);
    void remove(String id);

    boolean exist(String id);

    PhotoContainer find(String id) throws EntityNotFoundException;

    PhotoContainer findByAccount(Account account);
}
