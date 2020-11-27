package com.bookshelf.model;


import com.bookshelf.model.container.FileContainer;
import com.bookshelf.model.container.PhotoContainer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "published_date", nullable = false)
    private Date publishedDate;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "pageCount", nullable = false)
    private Integer pageCount;
    @Column(name = "price", nullable = false)
    private Double price;


    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToMany(mappedBy = "bookList")
    private List<Genre> genreList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "account_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "account_id"))
    private List<Account> likesAccountList = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "book")
    private Set<Purchase> purchases;

    @OneToMany(mappedBy = "book")
    private Set<PhotoContainer> photos;

    @OneToMany(mappedBy = "book")
    private Set<FileContainer> files;

}
