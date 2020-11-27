package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.License;

import java.util.List;

public interface LicenseService {

    void create(License license);
    void remove(String id);

    List<License> findAll();

    License findById(String id) throws EntityNotFoundException;

    boolean isExistById(String id);
    boolean isExistByName(String name);

}
