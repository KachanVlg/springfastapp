package com.example.springfast1.controllers;


import com.example.springfast1.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(("/books"))
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.addAll(List.of(
                new Book("Spring in Action", "Craig Walls", 2020),
                new Book("Effective Java", "Joshua Bloch", 2018),
                new Book("Clean Code", "Robert C. Martin", 2008),
                new Book("Design Patterns", "Erich Gamma", 1994),
                new Book("Refactoring", "Martin Fowler", 1999)
        ));
    }

    @GetMapping
    public Iterable<Book> getBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        for (Book book : books) {
            if(book.getId().equals(id)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {

        for(Book b : books) {
            if(b.getId().equals(id)) {
                int index = books.indexOf(b);
                books.set(index, book);
                return ResponseEntity.ok(book);
            }
        }
        return new ResponseEntity<>(addBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        books.removeIf(b -> b.getId().equals(id));
    }


}
