package com.bookshelf.service.impl;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.model.utils.Role;
import com.bookshelf.repository.AccountRepository;
import com.bookshelf.service.AccountService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Log4j
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;
    private final PasswordEncoder passwordEncoder;

    AccountServiceImpl(@Autowired AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.repository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<Account> findAll() {
        log.info("Get accounts list");
        return repository.findAll();
    }

    @Override
    public Account findById(String id) throws EntityNotFoundException {
        log.info("Find account by id: " + id);
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Account findByEmail(String email) {
        log.info("Find account with email: " + email);
        return repository.findByEmail(email);
    }

    @Override
    public void save(Account account) {
        account.setRole(Role.USER);
        account.setRegistrationDate(new Date(System.currentTimeMillis()));
        account.setPassword(passwordEncoder.encode(account.getPassword()));

        log.info("Save user Email:"+ account.getEmail() + " Role:" + account.getRole() + " Date:" + account.getRegistrationDate());
        repository.save(account);
    }

    @Override
    public void remove(String id) {
        if (!repository.existsById(id)) {
            log.info("Delete account with id:" + id);
            repository.deleteById(id);
        }
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
