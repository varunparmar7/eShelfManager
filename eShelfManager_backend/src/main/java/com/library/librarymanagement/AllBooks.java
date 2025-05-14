/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.library.librarymanagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Varun
 */
@Entity
@Table(name = "Books")
public class AllBooks {

    @Id
    private int isbn;
    @Column(name = "Title")
    private String title;
    @Column(name = "Author Name")
    private String aName;
    @Column(name = "Genre")
    private String genre;

    AllBooks() {   
    }

    AllBooks(int isbn, String title, String  aName, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.aName = aName;
        this.genre = genre;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
