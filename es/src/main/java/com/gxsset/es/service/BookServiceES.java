package com.gxsset.es.service;

import com.gxsset.es.entity.BookES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookServiceES {

    List<BookES> findByAuthor(String author);

    BookES save(BookES bookES);

    Page<BookES> findList(Pageable pageable);
}
