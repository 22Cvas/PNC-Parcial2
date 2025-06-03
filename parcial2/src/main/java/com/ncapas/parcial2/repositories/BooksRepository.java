package com.ncapas.parcial2.repositories;

import com.ncapas.parcial2.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository <Books, Integer>{
    Optional <Books>  findByIsbn(String isbn);
}
