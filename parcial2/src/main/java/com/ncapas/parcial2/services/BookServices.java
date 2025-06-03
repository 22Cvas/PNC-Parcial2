package com.ncapas.parcial2.services;

import com.ncapas.parcial2.entities.Books;
import com.ncapas.parcial2.entities.DTO.BooksDTO;
import com.ncapas.parcial2.repositories.BooksRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

    @Autowired
    private BooksRepository booksRepository;

    public void createBook(BooksDTO bookInfo) {
        Books book = new Books();
        book.setTitle(bookInfo.getTitle());
        book.setAuthor(bookInfo.getAuthor());
        book.setIsbn(bookInfo.getIsbn());
        book.setPublicationYear(bookInfo.getPublicationYear());
        book.setLanguage(bookInfo.getLanguage());
        book.setPages(bookInfo.getPages());
        book.setGenre(bookInfo.getGenre());

        booksRepository.save(book);
    }

    public void deleteBook(Integer Id){
        booksRepository.deleteById(Id);
    }

    public Books findBookByIsbn(String isbn){
        return booksRepository.findByIsbn(isbn).orElse(null);
    }
    public  Books findBookById(Integer Id){
        return booksRepository.findById(Id).orElse(null);
    }



}
