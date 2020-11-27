package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.License;
import com.bookshelf.repository.LicenseRepository;
import com.bookshelf.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseServiceImpl implements LicenseService {

    private final LicenseRepository repository;

    LicenseServiceImpl(@Autowired LicenseRepository licenseRepository) {
        this.repository = licenseRepository;
    }

    @Override
    public void create(License license) {
        repository.save(license);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public List<License> findAll() {
        return repository.findAll();
    }

    @Override
    public License findById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public boolean isExistById(String id) {
        return repository.existsById(id);
    }

    @Override
    public boolean isExistByName(String name) {
        return repository.existsByName(name);
    }
}
