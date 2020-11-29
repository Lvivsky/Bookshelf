package com.bookshelf.service;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    Account findById(String id) throws EntityNotFoundException;
    Account findByEmail(String email) throws EntityNotFoundException;

    void save(Account account);
    void remove(String id);

    boolean isExistByEmail(String email);
    boolean isExistById(String id);


}
