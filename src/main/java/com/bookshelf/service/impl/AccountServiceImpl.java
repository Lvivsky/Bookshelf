package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.repository.AccountRepository;
import com.bookshelf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;

    AccountServiceImpl(@Autowired AccountRepository accountRepository) {
        this.repository = accountRepository;
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account findById(String id) throws EntityNotFoundException {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Account findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void save(Account account) {
        repository.save(account);
    }

    @Override
    public void remove(String id) {
        if (!repository.existsById(id))
            repository.deleteById(id);
    }

    @Override
    public boolean isExistByEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public boolean isExistById(String id) {
        return repository.existsById(id);
    }


}
