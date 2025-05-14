/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.library.librarymanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Varun
 */
@Service
public class MyService {

    @Autowired
    private BookRepository br;

    private final List<AllBooks> books = new ArrayList<>();

    public List<AllBooks> getAllBooks(){
        return br.findDistinctBooks();
    }
    
    public AllBooks getBook(int isbn) {
        return br.findById(isbn).orElse(null);
    }

    public void addBook(AllBooks book){
        br.save(book);
    }

    public void updateBook(String title, AllBooks book){
        br.save(book);
    }

    public void deleteBook(int isbn) {
        AllBooks bookToRemove = br.findById(isbn).orElse(null);
        if (bookToRemove != null) {
            br.delete(bookToRemove);
        }
    }

}
