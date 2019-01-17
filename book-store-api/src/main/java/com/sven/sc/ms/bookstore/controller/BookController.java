package com.sven.sc.ms.bookstore.controller;

import com.sven.sc.ms.bookstore.domain.Book;
import com.sven.sc.ms.bookstore.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController()
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll() {

        return this.bookService.getBooks();
    }

}
