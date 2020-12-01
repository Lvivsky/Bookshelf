package com.bookshelf.model.utils;

import com.bookshelf.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Log4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomAccountDetails extends Account implements UserDetails {

    private Account account;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.commaSeparatedStringToAuthorityList(account.getRole().name());
    }

    @Override
    public String getUsername() {
        log.info("Account details: get username -> " + this.getEmail());
        return this.account.getEmail();
    }

    @Override
    public String getPassword() {
        log.info("Getting password");
        return this.account.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
