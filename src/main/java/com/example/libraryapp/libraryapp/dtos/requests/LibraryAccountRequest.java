package com.example.libraryapp.libraryapp.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class LibraryAccountRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
