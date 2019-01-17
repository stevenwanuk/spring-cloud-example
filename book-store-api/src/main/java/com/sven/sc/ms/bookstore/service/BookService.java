package com.sven.sc.ms.bookstore.service;

import com.sven.sc.ms.bookstore.domain.Book;
import com.sven.sc.ms.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {

        return this.bookRepository.getAll();
    }
}
