package com.pws.springbootmongodb.resource;

import com.pws.springbootmongodb.model.Book;
import com.pws.springbootmongodb.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookRepository repository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Added book with id : "+ book.getId();
    }
    @GetMapping("/allBooks")
    public List<Book> getBooks(){
        return repository.findAll();
    }
    @GetMapping("/findBooks/{id}")
    public Optional<Book> getBook(@PathVariable Integer id){
        return repository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id){
        repository.deleteById(id);
        return "Book deleted with id: "+id;
    }
}
