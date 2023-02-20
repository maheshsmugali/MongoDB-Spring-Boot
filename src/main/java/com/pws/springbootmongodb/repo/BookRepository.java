package com.pws.springbootmongodb.repo;

import com.pws.springbootmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
