package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.container.FileContainer;

public interface FileContainerService {

    void add(FileContainer file);
    void remove(String id);

    boolean exist(String id);

    FileContainer findById(String id) throws EntityNotFoundException;

}
