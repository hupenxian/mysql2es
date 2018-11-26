package com.gxsset.es.service.Impl;

import com.gxsset.es.entity.BookDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceDBImplTest {

    @Autowired
    private BookServiceDBImpl bookServiceDB;

    @Test
    public void findall() {
        List<BookDB> list = bookServiceDB.findall();
        for (BookDB bookDB : list)
            System.out.println(bookDB.toString());
        assertNotNull(list);
    }
}