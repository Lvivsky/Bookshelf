package com.bookshelf.model.container;

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
@Table(name = "files")
public class FileContainer {

    @JsonIgnore
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "size")
    private Long size;

    @JsonIgnore
    @Lob
    @Column(name = "data")
    private byte[] data;

    private String downloadUrl;

    public FileContainer(String fileName, String fileType, long size, byte[] data)
    {
        this.name = fileName;
        this.type = fileType;
        this.size = size;
        this.data = data;
    }


}
