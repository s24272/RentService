package com.example.VideoRent.service;

import com.example.VideoRent.data.BookRepository;
import com.example.VideoRent.entity.Books;
import com.example.VideoRent.entity.Games;
import com.example.VideoRent.entity.Users;
import com.example.VideoRent.enums.GameType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){

        save(new Books(1, "Dwa Światy", "Kazimierz Bober", LocalDate.of(2012,9,11)));
    }

}
