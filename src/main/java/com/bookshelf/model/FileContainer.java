package com.bookshelf.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "file_container")
public class FileContainer {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "name")      private String name;
    @Column(name = "type")      private String type;
    @Column(name = "size")      private Long size;

    @JsonIgnore
    @Lob
    @Column(name = "data")
    private byte[] data;

    @Column(name = "download_url")
    private String downloadUrl;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
