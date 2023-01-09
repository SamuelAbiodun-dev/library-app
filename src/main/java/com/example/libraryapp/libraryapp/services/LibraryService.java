
package com.example.libraryapp.libraryapp.services;

import com.example.libraryapp.libraryapp.dtos.requests.BookRequest;
import com.example.libraryapp.libraryapp.model.Author;
import com.example.libraryapp.libraryapp.model.Book;
import com.example.libraryapp.libraryapp.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class LibraryService {
        @Autowired
        LibraryRepository libraryRepository;
        public List<Book> getBookByAuthor(String author){
            List<Book> books = libraryRepository.findAll();
            for(int i = 0; i < books.size(); i++){
                if(!books.get(i).getAuthors().contains(author)){
                    books.remove(i);
                }
            }
            return books;
        }
        public Book getBookById(String id){
            Optional<Book> optionalBook = libraryRepository.findById(id);
            if (optionalBook.isPresent()) {
                return libraryRepository.findById(id).get();
            }
            throw new IllegalArgumentException("Book does not exist");

        }

        public List<Book> getBookByTitle(String title) {
            List<Book> books =  libraryRepository.findAll();
                for (int i = 0; i < books.size(); i++) {
                    if (!books.get(i).getTitle().equals(title)) {
                        books.remove(i);
                    }
                }
                return books;
            }
        }
//        public List<Book> getBookByTitle(BookRequest bookRequest){
//            return libraryRepository.getBookByTitle(bookRequest.getTitle());
//        }
//        public List<Book> getBookByCategory(BookRequest bookRequest){
//            return libraryRepository.getBookByCategory(bookRequest.getCategory());
//        }
//        public List<Book> viewAllBooks(){
//            return libraryRepository.findAll();
//        }

