package com.bookshelf.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;
    @Column(name = "birthday")
    private Date birthday;

//  TODO:  ONE TO ONE WITH PHOTO REPOSITORY
    private String photoId;




}
