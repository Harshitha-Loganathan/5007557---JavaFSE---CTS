//BookService.java
package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.repository.BookRepository;

@Service
public class BookService {
 private BookRepository bookRepository;

 @Autowired
 public void setBookRepository(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }

 public void addBook(String bookName) {
     // Implementation logic
     if (bookRepository != null) {
         // Add book to repository
        System.out.println("Adding " + bookName + " to the library.");
        bookRepository.save();
     } else {
         throw new NullPointerException("BookRepository is not initialized.");
     }
 }
}
