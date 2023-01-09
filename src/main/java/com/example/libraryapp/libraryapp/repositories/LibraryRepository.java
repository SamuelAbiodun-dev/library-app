package com.example.libraryapp.libraryapp.repositories;

import com.example.libraryapp.libraryapp.model.Author;
import com.example.libraryapp.libraryapp.model.Book;
import com.example.libraryapp.libraryapp.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends MongoRepository<Book, String> {
//List<Book> getBookAuthor(Author author);
//List<Book> getBookByTitle(String id);
//
////List<Book> getBookByTitle(String title);
//
////List<Book> getBookByCategory(Category category);
////List<Book> viewAllBooks();
}
