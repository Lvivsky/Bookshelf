package com.bookshelf.service;

import com.bookshelf.model.Account;
import com.bookshelf.model.utils.CustomAccountDetails;
import com.bookshelf.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final AccountRepository repository;

    @Autowired
    CustomUserDetailService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String userEmail) {
        Account account = repository.findByEmail(userEmail);

        if (Objects.isNull(account))
            throw new UsernameNotFoundException("No user with username " + account);
         else
            return new CustomAccountDetails(account);

    }
}
