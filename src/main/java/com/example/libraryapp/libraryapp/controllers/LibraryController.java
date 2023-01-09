package com.example.libraryapp.libraryapp.controllers;
import com.example.libraryapp.libraryapp.dtos.requests.BookRequest;
import com.example.libraryapp.libraryapp.model.Author;
import com.example.libraryapp.libraryapp.model.Book;
import com.example.libraryapp.libraryapp.model.Category;
import com.example.libraryapp.libraryapp.repositories.LibraryRepository;
import com.example.libraryapp.libraryapp.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @GetMapping("/book/{id}")
    public Book searchBookById(@PathVariable String id){
        return libraryService.getBookById(id);
    }

//
//
    @GetMapping("/book/author/{author}")
    public List<Book> searchBookByAuthor(@PathVariable String author) {
        return libraryService.getBookByAuthor(author);
}
@GetMapping("/book/title/{title}")
public List<Book> searchBookByTitle(@PathVariable String title){
    return libraryService.getBookByTitle(title);
}
//@GetMapping("/bookCategory")
//public List<Book> searchBookByCategory(@RequestBody BookRequest bookRequest){
//    return libraryService.getBookByCategory(bookRequest);
//}
//@GetMapping("/searchAll")
//public List<Book> searchAllBooks(){
//    return libraryService.viewAllBooks();
//}

}
