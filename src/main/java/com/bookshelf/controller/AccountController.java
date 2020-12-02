package com.bookshelf.controller;

import com.bookshelf.exception.EntityNotFoundException;
import com.bookshelf.model.Account;
import com.bookshelf.model.Book;
import com.bookshelf.model.License;
import com.bookshelf.model.container.FileContainer;
import com.bookshelf.model.container.PhotoContainer;
import com.bookshelf.repository.BookRepository;
import com.bookshelf.service.*;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Log4j
@Controller
public class AccountController {

    private final AccountService accountService;
    private final BookService bookService;
    private final FileContainerService fileContainerService;
    private final PhotoContainerService photoContainerService;
    private final GenreService genreService;
    private final LicenseService licenseService;

    @Autowired
    public AccountController(AccountService accountService,
                             BookService bookService,
                             FileContainerService fileContainerService,
                             PhotoContainerService photoContainerService,
                             GenreService genreService,
                             LicenseService licenseService) {
        this.accountService = accountService;
        this.bookService = bookService;
        this.fileContainerService = fileContainerService;
        this.photoContainerService = photoContainerService;
        this.genreService = genreService;
        this.licenseService = licenseService;

    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new Account());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") Account account, BindingResult bindingResult) {
        log.info("Try to register");
        if (bindingResult.hasErrors()) {
            log.error("Registration error!");
            return "registration";
        }
        accountService.save(account);
        log.info("Registration success");
        return "redirect:/account";
    }

    @GetMapping("/login")
    public String login(Model model, String logout, String error, Principal principal) {
        if (principal != null) {
            return "redirect:/account";
        }

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

    @GetMapping("img/core-img/logo2.png")
    public String login() {
        return "store";
    }



    @GetMapping("/create-book")
    public String creteBook(Model model) {
        model.addAttribute("genres", genreService.findAll());
        return "addbook";
    }

    @SneakyThrows
    @PostMapping("/create-book")
    public String createBook(@ModelAttribute("bookForm") Book book,
                             @ModelAttribute("photoForm") PhotoContainer photoContainer,
                             @ModelAttribute("fileForm") FileContainer fileContainer,
                             BindingResult bindingResult,
                             Principal user) {

        log.info("Try to add book");
        if (bindingResult.hasErrors()) {
            log.error("Add book fail!");
            return "addbook";
        }

        Account author = accountService.findByEmail(user.getName());
        book.setAccount(author);
        photoContainer.setBook(book);
        fileContainer.setBook(book);



        bookService.save(book);
        photoContainerService.add(photoContainer);
        fileContainerService.add(fileContainer);

        return "library";
    }




    @GetMapping( {"/", "/store"})
    public String welcome() {
        return "store";
    }

    @SneakyThrows
    @GetMapping("/published")
    public String published(Model model, Principal principal) {

        Account account = accountService.findByEmail(principal.getName());

        if (account.getLicense() != null) {
            License license = licenseService.findById(account.getLicense());
            model.addAttribute("myLicense", license);
            model.addAttribute("account", account);
        }
        else {
            model.addAttribute("licenseList",licenseService.findAll());
        }
        return "published";
    }

    @SneakyThrows
    @GetMapping("/library")
    public String library(Model model, Principal principal) {

        Account account = accountService.findByEmail(principal.getName());

//        Book likedBooks = bookService.


        return "library";
    }

    @SneakyThrows
    @GetMapping("/account/{email}")
    public String account(@PathVariable("email") String email, Model model) {
        Account account = accountService.findByEmail(email);
        PhotoContainer photos = photoContainerService.findByAccount(account);

        model.addAttribute("account", account);
        model.addAttribute("photos",photos);
        return "account";
    }

    @GetMapping("/account")
    public String account() {
        return "redirect:/store";
    }




}
