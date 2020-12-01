package com.bookshelf.service;

import com.bookshelf.model.Account;
import com.bookshelf.model.utils.CustomAccountDetails;
import com.bookshelf.repository.AccountRepository;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Log4j
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final AccountRepository repository;

    @Autowired
    CustomUserDetailService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        Account account = repository.findByEmail(email);

        if (Objects.isNull(account)) {
            log.error("No user with email: " + email);
            throw new UsernameNotFoundException("No user with email: " + email);
        }
        else {
            log.info("Username has found successful");
            return new CustomAccountDetails(account);
        }

    }
}
