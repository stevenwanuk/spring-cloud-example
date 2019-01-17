package com.sven.sc.ms.bookstore.controller;

import com.sven.sc.ms.bookstore.config.Settings;
import com.sven.sc.ms.bookstore.domain.BookStore;
import com.sven.sc.ms.bookstore.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/bookStore")
public class BookStoreController {

    private Settings bookStoreSettings;
    private BookService bookService;

    public BookStoreController(Settings bookStoreSettings, BookService bookService) {

        this.bookStoreSettings = bookStoreSettings;
        this.bookService = bookService;
    }

    @GetMapping()
    public BookStore getBookStoreSettings() {

        return BookStore.builder().books(bookService.getBooks()).owner(bookStoreSettings.getOwner()).build();
    }
}
