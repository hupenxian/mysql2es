package com.gxsset.es.service;

import com.gxsset.es.entity.BookES;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceESTest {

    @Autowired
    private BookServiceES bookServiceES;

    @Test
    public void findByAuthor() {

        List<BookES> bookESList = bookServiceES.findByAuthor("hpxa");
        assertNotNull(bookESList);
    }

    @Test
    public void save() {

        BookES bookES = new BookES();
        bookES.setId(1010);
        bookES.setName("golang");
        bookES.setAuthor("Max");
        BookES res = bookServiceES.save(bookES);

        assertNotNull(res);
    }
}