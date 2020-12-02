package com.bookshelf.controller;

import com.bookshelf.model.Genre;
import com.bookshelf.service.AccountService;
import com.bookshelf.service.GenreService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j
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
        return "admin/admin";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }

    @GetMapping("/admin-genres")
    public String adminGenres(Model model) {
        model.addAttribute("genreForm", new Genre());
        model.addAttribute("genres", genreService.findAll());
        return "admin/admin-genres";
    }

    @PostMapping("/admin-genres")
    public String adminGenresAdd(@ModelAttribute("genreForm") Genre genre, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            log.error("Binding error!");

        if (!genreService.exist(genre.getName())) {
            log.info("Add new genre: " + genre.getName());
            genreService.create(genre);
        } else {
            log.error("Duplicate genres");
        }
        return "redirect:/admin-genres";
    }

    @GetMapping("/admin-genres/delete/{id}")
    public String adminGenresRemove(@PathVariable("id") String id) {
        log.info("Try delete genre with id: " + id);
        genreService.remove(id);
        return "redirect:/admin-genres";
    }


    @GetMapping("/admin-books")
    public String adminBooks(Model model) {
        return "admin/admin-genres";
    }
    @GetMapping("/admin-orders")
    public String adminOrders(Model model) {
        return "admin/admin-orders";
    }
    @GetMapping("/admin-accounts")
    public String adminAccounts(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "admin/admin-accounts";
    }


}
