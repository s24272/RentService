package com.example.VideoRent.service;

import com.example.VideoRent.data.BookRepository;
import com.example.VideoRent.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Books> find(int id){
        return bookRepository.findById(id);
    }

    public Iterable<Books> findAll(){
        return bookRepository.findAll();
    }

    public Books save(Books book){
        return bookRepository.save(book);
    }

    public void delete(int id){
        bookRepository.deleteById(id);
    }

}
