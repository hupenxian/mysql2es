package com.gxsset.es.service.Impl;

import com.gxsset.es.entity.BookDB;
import com.gxsset.es.repository.BookRepositoryDB;
import com.gxsset.es.service.BookServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceDBImpl implements BookServiceDB {

    @Autowired
    private BookRepositoryDB bookRepositoryDB;

    public List<BookDB> findall(){
        List<BookDB> list = bookRepositoryDB.findAll();
        return list;
    }

}
