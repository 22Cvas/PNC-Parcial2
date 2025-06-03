package com.ncapas.parcial2.entities.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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


}
