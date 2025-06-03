package com.ncapas.parcial2.entities;

import jakarta.persistence.*;
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

    @Column(name = "isbn" , nullable = false, unique = true)
    private String isbn;

    @Column(name = "publication_year" , nullable = false)
    private Integer publicationYear;

    @Column(name = "language" , nullable = false)
    private String language;

    @Column(name = "pages" , nullable = false)
    private Integer pages;

    @Column(name = "genre" , nullable = false)
    private String genre;
}
