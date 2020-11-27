package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Purchase;

import java.util.List;

public interface PurchaseService {

    void create(Purchase purchase);
    void remove(String id);

    Purchase findById(String id) throws EntityNotFoundException;

    List<Purchase> findAll();
    List<Purchase> findAllByAccount(String accountId);

}
