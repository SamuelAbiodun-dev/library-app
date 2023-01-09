package com.example.libraryapp.libraryapp.dtos.requests;

import com.example.libraryapp.libraryapp.model.Author;
import com.example.libraryapp.libraryapp.model.Book;
import com.example.libraryapp.libraryapp.model.Category;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BookRequest {
    private String id;
    private Author author;
    private String title;
    private Category category;
}
