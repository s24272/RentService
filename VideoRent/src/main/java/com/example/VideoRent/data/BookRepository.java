package com.example.VideoRent.data;

import com.example.VideoRent.entity.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Books, Integer> {
}
