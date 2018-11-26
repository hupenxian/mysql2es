package com.gxsset.es.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@Document(indexName = "book", type = "novel")
public class BookES {

    @Id
    private Integer id;

    private String name;

    private String author;

}
