package com.gxsset.es.repository;

import com.gxsset.es.entity.BookDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepositoryDB extends JpaRepository<BookDB,Integer> {
}
