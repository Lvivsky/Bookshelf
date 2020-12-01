package com.bookshelf.controller;

import com.bookshelf.model.Account;
import com.bookshelf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    private final AccountService service;

    @Autowired
    public AccountController(AccountService accountService) {
        this.service = accountService;
    }



    @GetMapping("/registration")
    public String registration(Model model) {

        model.addAttribute("userForm", new Account());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") Account account, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
            return "registration";

        service.save(account);

        return "redirect:/store";
    }

    @GetMapping("/login")
    public String login(Model model, String logout, String error)
    {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "You have been logged out.");
        }

        return "login";
    }

    @GetMapping( {"/", "/store"})
    public String welcome()
    {
        return "store";
    }

    @GetMapping("/published")
    public String published()
    {
        return "published";
    }

    @GetMapping("/library")
    public String anonymous()
    {
        return "library";
    }





}
