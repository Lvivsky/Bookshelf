package com.bookshelf.controller;

import com.bookshelf.service.AccountService;
import com.bookshelf.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminController {

    private final AccountService accountService;
    private final GenreService genreService;


    @Autowired
    public AdminController(AccountService accountService,
                           GenreService genreService) {
        this.accountService = accountService;
        this.genreService = genreService;
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }

    @GetMapping("/admin/genre")
    public String genres(Model model) {
        model.addAttribute("genres", genreService.findAll());
        return "admin-genres";
    }



}
