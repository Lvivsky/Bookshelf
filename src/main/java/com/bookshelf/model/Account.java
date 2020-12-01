package com.bookshelf.model;

import com.bookshelf.model.container.PhotoContainer;
import com.bookshelf.model.utils.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "registration_date", nullable = false)
    private Date registrationDate;
    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "birthday", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @OneToMany(mappedBy = "account")
    private Set<Book> books;

    @ManyToMany(mappedBy = "likesAccountList", cascade = CascadeType.ALL)
    private List<Book> likesBookList = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private Set<Comment> comments;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "license_id", referencedColumnName = "id")
    private License license;

    @OneToMany(mappedBy = "account")
    private Set<Purchase> purchases;

    @OneToMany(mappedBy = "account")
    private Set<PhotoContainer> photos;

}
