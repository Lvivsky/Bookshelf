package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Purchase;
import com.bookshelf.repository.PurchaseRepository;
import com.bookshelf.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository repository;

    PurchaseServiceImpl(@Autowired PurchaseRepository purchaseRepository) {
        this.repository = purchaseRepository;
    }

    @Override
    public void create(Purchase purchase) {
        repository.save(purchase);
    }

    @Override
    public void remove(String id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public Purchase findById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Purchase> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Purchase> findAllByAccount(String accountId) {
        return repository.findAllByAccountId(accountId);
    }
}
