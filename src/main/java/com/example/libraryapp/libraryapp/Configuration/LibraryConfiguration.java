package com.example.libraryapp.libraryapp.Configuration;

import com.example.libraryapp.libraryapp.model.Author;
import com.example.libraryapp.libraryapp.model.Book;
import com.example.libraryapp.libraryapp.model.Category;
import com.example.libraryapp.libraryapp.repositories.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;
@Configuration
public class LibraryConfiguration {
    @Bean
    CommandLineRunner runner(LibraryRepository libraryRepository) {
        return args -> {

            Book book = new Book(
                    "Social Science",
                    List.of("Luke John", "Peter Paul"),
                    Category.ART,
                    LocalDateTime.now(),
                    120,
                    2000
            );

            libraryRepository.save(book);
        };
    }
}
