package com.ncapas.parcial2.repositories;

import com.ncapas.parcial2.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository <Books, Integer>{
    Optional <Books>  findByIsbn(String isbn);
    Optional <Books>  findByAuthor(String author);
    Optional<Books> findByGenre(String genre);
    Optional<Books> findByLanguage(String language);
}
