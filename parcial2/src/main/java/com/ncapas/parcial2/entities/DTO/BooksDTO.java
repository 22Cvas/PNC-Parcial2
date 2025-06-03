package com.ncapas.parcial2.entities.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BooksDTO {


    private String title;


    private String author;


    private String isbn;

    private int publicationYear;

    private String language;

    private int pages;


    private String genre;


    public BooksDTO(@Size(min = 13 , max = 13) String isbn) {
    }
}
