package com.ncapas.parcial2.controllers;

import com.ncapas.parcial2.entities.Books;
import com.ncapas.parcial2.entities.DTO.BooksDTO;
import com.ncapas.parcial2.services.BookServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServices bookServices;

    private Pattern title_REGEX =
            Pattern.compile("^[0-9a-fA-F]{13}$");

    private Pattern isbn_REGEX =
            Pattern.compile("^[0-9]{3}-[0-9]{1}-[0-9]{2}-[0-9]{6}-[0-9]{1}$");

    @PostMapping("/created")
    public ResponseEntity<Void> createBook(@RequestBody @Valid BooksDTO bookInfo) {
        try {
            bookServices.createBook(bookInfo);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @DeleteMapping("/delete/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bookServices.deleteBook(bookId);
    }

    @GetMapping("/get/isbn")
    public ResponseEntity<BooksDTO> findBookByIsbn(@RequestParam("isbn") String isbn) {
        return ResponseEntity.ok(bookServices.findBookByIsbn(isbn));
    }
}
