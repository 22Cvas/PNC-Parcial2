package com.ncapas.parcial2.repositories;

import com.ncapas.parcial2.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository <Books, Integer>{
    
}
