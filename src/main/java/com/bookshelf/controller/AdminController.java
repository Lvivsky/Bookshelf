package com.bookshelf.controller;

import com.bookshelf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    private final AccountService service;

    @Autowired
    public AdminController(AccountService accountService) {
        this.service = accountService;
    }

    @GetMapping("/admin")
    public String admin()
    {
        return "admin";
    }

    @GetMapping("/access-denied")
    public String accessDenied()
    {
        return "access-denied";
    }

}
