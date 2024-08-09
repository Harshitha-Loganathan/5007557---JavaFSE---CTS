package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void addBook() {
        System.out.println("Adding a book to the library.");
        bookRepository.save();
    }

}



