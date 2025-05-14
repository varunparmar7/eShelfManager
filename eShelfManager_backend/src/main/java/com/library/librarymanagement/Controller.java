/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.library.librarymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Varun
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/books")
public class Controller {

    @Autowired
    private MyService mys;

    @Autowired
    private BookRepository allBooksRepository;

    @GetMapping
    public List<AllBooks> getAllBooks() {
        return mys.getAllBooks();
    }

    @GetMapping("/{isbn}")
    public AllBooks getBook(@PathVariable int isbn) {
        return mys.getBook(isbn);
    }

    @PostMapping
    public ResponseEntity<AllBooks> addBook(@RequestBody AllBooks topic) {
        mys.addBook(topic);
        return new ResponseEntity<>(topic, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public void updateTopic(@RequestBody AllBooks topic, @PathVariable String id) {
        mys.updateBook(id, topic);
    }

    @DeleteMapping("/{isbn}")
    public void deleteTopic(@PathVariable int isbn) {
        mys.deleteBook(isbn);
    }

    @GetMapping("/search/{letter}")
    public List<AllBooks> findThatContains(@PathVariable String letter) {
        return allBooksRepository.findThatContains(letter);
    }

}
