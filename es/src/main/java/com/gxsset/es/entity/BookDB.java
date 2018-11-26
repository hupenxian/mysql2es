package com.gxsset.es.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "book")
public class BookDB {

    @Id
    private Integer id;

    private String name;

    private String author;

}
