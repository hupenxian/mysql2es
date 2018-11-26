package com.gxsset.es.repository;

import com.gxsset.es.entity.BookES;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepositoryES extends ElasticsearchRepository<BookES,Integer> {

    List<BookES> findByAuthor(String author);

    Page<BookES> findAll(Pageable pageable);
}
