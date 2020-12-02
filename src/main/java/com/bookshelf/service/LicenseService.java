package com.bookshelf.service;

import com.bookshelf.model.License;

import java.util.List;

public interface LicenseService {

    void create(License license);
    void remove(String id);

    List<License> findAll();

    License findById(License id);

    boolean isExistById(String id);
    boolean isExistByName(String name);

}
