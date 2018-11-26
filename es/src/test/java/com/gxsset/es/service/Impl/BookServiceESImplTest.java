package com.gxsset.es.service.Impl;

import com.gxsset.es.entity.BookES;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceESImplTest {

    @Autowired
    private BookServiceESImpl bookServiceES;


    @Test
    public void findByAuthor() {
    }

    @Test
    public void save() {
    }

    @Test
    public void findList() {

        PageRequest request = new PageRequest(0,10);
        Page<BookES> bookESPage = bookServiceES.findList(request);
        Assert.assertNotEquals(0,bookESPage.getTotalElements());

    }
}