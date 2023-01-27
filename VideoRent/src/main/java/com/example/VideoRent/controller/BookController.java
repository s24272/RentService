package com.example.VideoRent.controller;

import com.example.VideoRent.entity.Books;
import com.example.VideoRent.entity.Games;
import com.example.VideoRent.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/all")
    public Iterable<Books> getAll(){
        return bookService.findAll();
    }
    @GetMapping("{id}")
    public Optional<Books> findById(@PathVariable int id){
        return bookService.find(id);
    }
    @PostMapping("/add")
    public Books addBook(@RequestBody Books book){
        return bookService.save(book);
    }
    @PutMapping("/ubdate")
    public Books updateGame(@RequestBody Books book){
        return bookService.save(book);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        bookService.delete(id);
    }
}
