package com.bookshelf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// import com.example.spring.repository.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

//    TODO: FINISH SECURITY CONFIGURATION

//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder builder, @Autowired CustomUserDetailsService customUserDetailsService) throws Exception
//    {
//        builder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//    }

}
