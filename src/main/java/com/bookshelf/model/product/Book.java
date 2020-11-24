package com.bookshelf.model.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    private String id;
    private Date publishedDate;
    private String name;
    private String description;
    private Double price;

//     TODO: MANY TO ONE WITH GENRE
    @ManyToOne
    private Set<Genre> genres;


}
