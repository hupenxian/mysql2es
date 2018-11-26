package com.gxsset.es.service.Impl;

import com.gxsset.es.entity.BookES;
import com.gxsset.es.repository.BookRepositoryES;
import com.gxsset.es.service.BookServiceES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceESImpl implements BookServiceES {

    @Autowired
    private BookRepositoryES bookRepositoryES;

    @Override
    public List<BookES> findByAuthor(String name) {
        return bookRepositoryES.findByAuthor(name);
    }

    @Override
    public BookES save(BookES bookES) {
        return bookRepositoryES.save(bookES);
    }

    @Override
    public Page<BookES> findList(Pageable page) {

        return bookRepositoryES.findAll(page);
    }

}
