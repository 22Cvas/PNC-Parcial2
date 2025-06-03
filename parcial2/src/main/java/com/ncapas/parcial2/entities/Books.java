package com.ncapas.parcial2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title" , nullable = false)
    private String title;

    @Column(name = "author" , nullable = false)
    private String author;

    @Size(min = 13 , max = 13)
    @Column(name = "isbn" , nullable = false, unique = true, length = 13)
    private String isbn;

    @Column(name = "publication_year" , nullable = false)
    private int publicationYear;

    @Column(name = "language")
    private String language;

    @Column(name = "pages" , nullable = false)
    private int pages;

    @Column(name = "genre" , nullable = false)
    private String genre;
}
