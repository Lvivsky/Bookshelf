package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.container.FileContainer;
import com.bookshelf.repository.FileContainerRepository;
import com.bookshelf.service.FileContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileContainerServiceImpl implements FileContainerService {

    private final FileContainerRepository repository;

    @Autowired
    FileContainerServiceImpl(FileContainerRepository fileContainerRepository) {
        this.repository = fileContainerRepository;
    }

    @Override
    public void add(FileContainer file) {
        repository.save(file);
    }

    @Override
    public void remove(String id) {
        if(repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public boolean exist(String id) {
        return repository.existsById(id);
    }

    @Override
    public FileContainer findById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
