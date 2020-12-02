package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.model.container.PhotoContainer;
import com.bookshelf.repository.PhotoContainerRepository;
import com.bookshelf.service.PhotoContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoContainerServiceImpl implements PhotoContainerService {

    private final PhotoContainerRepository repository;

    @Autowired
    PhotoContainerServiceImpl(PhotoContainerRepository photoContainerRepository) {
        this.repository = photoContainerRepository;
    }

    @Override
    public void add(PhotoContainer file) {
        repository.save(file);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public boolean exist(String id) {
        return repository.existsById(id);
    }

    @Override
    public PhotoContainer find(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public PhotoContainer findByAccount(Account account) {
        return repository.findByAccount(account);
    }
}
