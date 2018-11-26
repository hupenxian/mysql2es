package com.gxsset.es.controller;


import com.gxsset.es.entity.BookDB;
import com.gxsset.es.entity.BookES;
import com.gxsset.es.service.BookServiceDB;
import com.gxsset.es.service.BookServiceES;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceES bookServiceES;

    @Autowired
    private BookServiceDB bookServiceDB;

    @PostMapping("/sync")
    public void Sync (){

        List<BookDB> bookDBList = bookServiceDB.findall();

        for (BookDB bookDB: bookDBList){
            BookES bookES = new BookES();
            BeanUtils.copyProperties(bookDB,bookES);
            bookServiceES.save(bookES);
        }

    }

    @GetMapping("/list")
    public Page<BookES> list(@RequestParam(value = "page",defaultValue = "0")Integer page,
                             @RequestParam(value = "size",defaultValue = "10")Integer size){
        PageRequest pageRequest = new PageRequest(page,size);
        Page<BookES> bookESPage = bookServiceES.findList(pageRequest);
        for (BookES bookES:bookESPage)
            System.out.println(bookES.toString());

        return bookESPage;

    }

}
