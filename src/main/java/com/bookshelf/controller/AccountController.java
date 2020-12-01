package com.bookshelf.controller;

import com.bookshelf.model.Account;
import com.bookshelf.service.AccountService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j
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
        log.info("Try to register");
        if (bindingResult.hasErrors()) {
            log.error("Registration error!");
            return "registration";
        }
        service.save(account);
        log.info("Registration success");
        return "redirect:/store";
    }

    @GetMapping("/login")
    public String login(Model model, String logout, String error)
    {
        log.info("Try to log in");
        if (error != null) {
            log.error("Email or password is not found!");
            model.addAttribute("error", "Username or password is incorrect.");
        }
        if (logout != null) {
            log.info("You have been logged out");
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
