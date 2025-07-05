package com.library.librarymgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.librarymgmt.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}

