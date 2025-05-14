/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.library.librarymanagement;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Varun
 */
public interface BookRepository extends CrudRepository<AllBooks, Integer>{

    @Query("SELECT DISTINCT b FROM AllBooks b")
    List<AllBooks> findDistinctBooks();

    @Query("SELECT DISTINCT b FROM AllBooks b WHERE b.title LIKE %:letter%")
    List<AllBooks> findThatContains(@Param("letter") String letter);
    
}
