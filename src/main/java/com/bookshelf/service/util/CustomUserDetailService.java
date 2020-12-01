package com.bookshelf.service.util;

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
    public UserDetails loadUserByUsername(String username) {
        Account account = repository.findByEmail(username);

        if (Objects.isNull(account)) {
            log.error("No user with email: " + username);
            throw new UsernameNotFoundException("No user with email: " + username);
        }
        else {
            log.info("Login with email: " + username);
            return new CustomAccountDetails(account);
        }

    }
}
